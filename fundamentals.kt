
// https://developer.android.com/courses/kotlin-bootcamp/overview


fun main() {
    println("Hello,World")
    println("I")
    println("know") 
    println("Kotlin")
    println("well.")

    print("Hello,World")
    print("I")
    print("know")
    print("Kotlin")
    print("well.")

    //Integers
    println(22 / 7)

    //Decimal Numbers
    println(22.0/7.0)

    //The remainder Operation 
    28 % 10 

    // If we want to compute the same thing using decimal numbers 
    28.0 / 10.0
    // The results is identical to using a format specifier 
    println("%.0f".format(28.0 % 10.0))

    //Shift operations 
    // These are infix operations that you plac ein between operations so it looks like an operation 
    // The Shift left and Shift right operations take the binary form of decimal number and shift the digits left or right then they return the new decimal form of the new binary number 
    //  The digits that come in to fill the empty spots on the right become zero 0 
    // Shift left - shl
    //Shift right - shr

    println(1 shl 3 )
    println(32 shr 2)
    // On reason for using shifts is making multiplting or dividing by powers of two easy 
    // Shifting left by one is the same as multiplying by two, shifiting ledt by two is the same thing as multiplying by four and so on....
    
}