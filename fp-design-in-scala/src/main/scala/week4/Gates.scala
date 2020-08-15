// https://www.coursera.org/learn/progfun2/lecture/62Xed/lecture-4-6-discrete-event-simulation-implementation-and-test

package week4

import week4.Simulation

abstract class Gates extends Simulation{

    def InverterDelay: Int
    def AndGateDelay: Int 
    def OrGateDelay: Int

        class Wire{

        private var sigVal = false
        private var actions:  List[Action] = List()

        def getSignal = sigVal

        def setSignal(s: Boolean) = 
            if (s != sigVal){
                sigVal = s
                actions foreach ( _() )
            }

        def addAction(a: Action) = {
            actions = a :: actions
            a()
        }
    }

    def inverter(input: Wire, output: Wire): Unit = {
        def invertAction(): Unit = {
            val inputSig = input.getSignal
            afterDelay(InverterDelay){
                output setSignal !inputSig
            }
        }
        input addAction invertAction
    }

    def andGate(in1: Wire, in2: Wire, output: Wire) = {
        def andAction() = {
            val in1sig = in1.getSignal
            val in2sig = in2.getSignal
            afterDelay(AndGateDelay){
                output setSignal (in1sig & in2sig)
            }
        }
        in1 addAction andAction
        in2 addAction andAction
    }

    def orGate(in1: Wire, in2: Wire, output: Wire): Unit = {
        def orAction() = {
            val in1sig = in1.getSignal
            val in2sig = in2.getSignal
            afterDelay(OrGateDelay){
                output setSignal (in1sig | in2sig)
            }
        }
        in1 addAction orAction
        in2 addAction orAction
    }

    def probe(name: String, wire: Wire): Unit = {
        def probeAction(): Unit = {
            println(name + " " + currentTime + " new-value = " + wire.getSignal)
        }
        wire addAction probeAction
    }
}