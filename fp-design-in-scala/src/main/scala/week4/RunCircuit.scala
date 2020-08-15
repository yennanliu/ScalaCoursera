// https://www.coursera.org/learn/progfun2/lecture/62Xed/lecture-4-6-discrete-event-simulation-implementation-and-test

object RunCircuit extends App{

    println("Running RunCircuit program...")
    object sim extends Circuits with Parameters 
    import sim._
    val in1, in2, sum, carry = new Wire
    halfAdder(in1, in2, sum, carry)
    probe("sum", sum)
    probe("carry", carry)

    // run the simulation 1 
    in1 setSignal true
    run()

    // run the simulation 2 
    in2 setSignal true
    run()

    // run the simulation 3
    in1 setSignal false 
    run()

    // TODO : fix above run time errors
}