
// https://developer.android.com/courses/kotlin-bootcamp/overview
//Kotlin Apprentice 
import kotlin.math.* 

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
    // Shifting left by one is the same as multiplying by two, shifiting left by two is the same thing as multiplying by four and so on....

    //Operator Precedence in Kotlin 
    350 / 5 + 2 
    // dvides by 5 then adds 2 
    350 / (5 + 2)
    // evaluates 5 + 2 then 350 divides it 

    //Math functions 
    println(sin(45 * PI / 180));

    println(sin(135 * PI / 180));

    println(sqrt(7.9));

    println(max(8, 137));

    min(-3 ,-14);

    //Naming data 
    // You use the val keyword to declare constants , it acnnot be reassigned 
    val number : Int = 10
    // The IDE will show an error 
    // number = 14;
    val pi : Double = 3.14159

    // you can also add the const keyword to val to make it a compile time constant 
    

// when you have data that might cange over time you declare it with a variale with var 

    // var variableNumber = 0


    // variableNumber = 0
    // variableNumber = 1_000_000

    // increment and decrement
    var counter : Int = 0;

    counter += 1 
    
    counter -= 1 

    //same thing as 
    var counter1 :Int = 0;

    counter1 = counter1 + 1 

    counter1 = counter - 1 

    //Mini Exercises 

    //Challenges 


    //Types and operations 
    // A type represents a set of values adn the operaions that can be performed on them 

    //Type Conversion
    var integer:Int = 100
    var decimal:Double = 12.5
    // integer = decimal 

    //You will get an error - a type mismatch 
    // Some programmng languages are not as strict and will allow the type conversin , koltin willl not allow you to do that 
    // instead of assigning , you need to say you want to explicitly convert the tyep 

    // you now tell kotlin you want to convert fro the original type Double to the new type Int 

    // also, assigning a deicmal value to the integer results in a loss of precision 


    integer = decimal.toInt()

    print(integer)

    //Operators with mixed types 

    var hourlyRate:Double = 19.5

    var hoursWorked:Int = 10 

    //hours worked is converted to a double here,
    var totalCost : Double = hourlyRate * hoursWorked.toDouble();

    // but the conversion is unnecessary , kotlin will alow you to multiply these values wihtout any conversion 

    val totalCost1: Double = hourlyRate * hoursWorked


    //Sometimes you don't need to tell kotlin the type verytime , by type inference the compile knows 
    var typeInferredInt = 90

    // Here kotlin infers the type as an int , what if you want it to be inferred as a double 
    var wantADouble = 3.toDouble();

    // something you may be tempted to try ( and something i though could work is this)
    //this is not allowed
    //The integer literal does not conform to the expected type Doublekotlin(CONSTANT_EXPECTED_TYPE_MISMATCH)
    // var actuallyDouble : Double = 3 ;

    //Strings 
    //At its base, a computer needs to be able to translate a character intot the computers language and it does so by assigning eacch character a different number .This forms a two way mapping form character to number called character set , the most standrad character set mapping today , is called Unicode 
    // The number associated with each number is called a code point 
    val characterA: Char = 'a';
    val stringDog : String = "Dog";

    //Concatenation
    // you can concatenate strings with the addition operator or the addition assignment operator 
    var message = "Hello " + "World "
    val name = "hwywisung"  
    message += name;
    println(message);

    //String templates 
    val messageTemplate = "hello my name is $name"
    println(messageTemplate)

    val oneThird = 1.0 / 3.0

    val oneThirdLogString = "one third is $oneThird as a decimal";

    val oneThirdLogString1 = "one third is ${1.0 / 3.0} as a decimal"

    // for the one thrid value, its result in the stirng temlate will be 0.33333333333333333, because it takes infinite characters to represent one third as a decimal , because it is a preating number 

    // that one of the disadvantages of template strings, it offers no way to customize the output 

    //Multi line Strings 
    val bigString = """
    | you cna have
    | a string that
    |contains multiple ines
    |by doing this.
    """.trimMargin()
    //The pipe hcaracter at the start of each kine prevents the stirng from having leading spaces
    print(bigString)

    //Pairs and Triples 
    // Sometimes data comes in groups e.g a pair of (x,y) coordinates on a 2d grid 
    //SImlarly a set of coorodinates on a 3d grid is comprised of an xvalue a yvalue and a z value'
    // in kotlin we can represent these types of data using a Pair or a Triple (other languages use a type called tuple)
    // if you want to have more than three vaues you use what kotlin calls a data class 

    val coordinates: Pair<Int, Int> = Pair(2,3)

    // leveraging on type inference 
    val coordinatesInferred = Pair(2,3)

    // we can even make this more concise using the to operator 
    val coordinatesWithTo = 2 to 3 

    //pair of doubles can be created to 
    val coordinateDoubles = Pair(2.1,2.3)

    // hw to acccess data inside a pair 
    val x1 = coordinates.first
    val y1 = coordinates.second

    // you can also use a destructuring  decalration on individual parts fo the pair 

    val (x,y) = coordinates 

    println(x);
    println(x1);
    println(y);
    println(y1);

    //Triples 
    val coordinates3D = Triple(1, 3, 5)

    // destructuring declaration
    val (x3, y3, z3) = coordinates3D

    val x6 = coordinates3D.first
    val y6 = coordinates3D.second
    val z6 = coordinates3D.third

    // if you want to ignore a certain element of a Pair or Triple, you can replace the space its uspposed to occupy (corresponding part of the variable in the declaration) with an underscore 
    val(x5,y5, _) = coordinates3D

    //Mini exercises
    val DDmmYY = Triple(4,29,2023)

    val month = DDmmYY.first
    val day = DDmmYY.second 
    val year = DDmmYY.third 

    val (_,mth,yr) = DDmmYY

    val monthModified = DDmmYY.first.toString();

    val newPair = Pair(monthModified,year) 

    //Number Types 
    //primitives require less memory - they are better for performance , but they also lack some of the features of Integer , in Kotlin you don;t have to worry whether you are using a primitive type or an objct type, kotlin handles that complexity for you 

    // You have been using double to represent fractional numbers, Kotlin offers a Float type that has lessr anrge and precision but occupies or has less sotrage size , regardless of that odern ahradware has been optimized for Doubles , so use doubles unless ypu have a good reason not to 

    val a : Short = 12
    val b : Byte = 120
    val c : Int = -10000000

    val answer = a + b + c 

    //answer will be in Int 
    println(answer)

    //Any , Unit and Nothing Types 
    // The nay type can be thought of as the mother of all types (except nullable types) any other type like Integer or String can still be considered as Any 
    
    //Unit is a special type that only ever represents one value called the unit , it is similar to the void type in java except it makes working with generics easier , every function which does not whihc does not epxlicitly return a type (for example String) returns Unit 

    val anyNumber : Any = 42
    val anyString :Any = "42"

    fun add() {
        val result = 2 + 2 
        println(result)
    }
    // The return type UNit is imlied so the above function is the same as this 
    fun add1():Unit {
        val result = 2 + 2
        println(result)
    }
    // Nothing is a type that is helpful for decalring that a function not only doesn't return anything but also never completes 
    //Challenges 
    val coordinatesS = Pair(2,3)

    val row = coordinatesS.first
    val column = coordinatesS.second 

    //Basic Control Flow 
    //Comparison Operators
    val doesOneEqualTwo = (1 == 2)

    val doesOneNotEqualTwo = (1 != 2)

    // String equality
    // you can compare strings for equality, and just as you can do with numbers, you can chck if one is lrager than the other 
    val guess = "dog"
    val dogEqualsCat = guess == "cat";
    val order = "cat" < "dog"
    println(guess)
    println(dogEqualsCat) 
    // we can encapsulate code with the use of braces 
   
    // Advanced Control Flow
// Ranges
// The range data type represents a sequence of countable integers
    val closedRange = 0..5
    // the .. signifes that the sequence is closed , means that the range goes from 0 to 5 inclusive

    //Second theres a half open range 
    val halfOpenRange = 0 until 5 
    // the range goes from 0 to 4 

    // theres a decreasing range 
    val decreaasingRange = 5 downTo 0 

    //for loops 
    val count = 10 

    var sum = 0 
    for (i in 1..count) {
        sum += i
    }
    //repeat loops 
    // you can use it when you want ot loop a number of times and you don't want to use the loop constant at all
    var sum1 = 1
    var lastSum = 0
    repeat(10) { 
        val temp = sum1
        sum1 += lastSum
        lastSum = temp
    }
    //Steps in loops 
    // it is also possible to perform certain iterations in tha range 
    // the loop will only run through the values that the step falls on 
    var sum2 = 0 
    for (i in 1..count step 2 ) {
        sum2 += i 
        println(i)
    }
    var sum3 = 0;
    for (i in count downTo 1 step 2 ) {
        sum3 += i 
        println(i) 
        println("step2")
    }
    //labelled statements 
    // you want to skip a loop itertion for a particular case without breaking out of the loop entirely , this can be done with the continue statement 
    sum = 0 
    rowLoop@ for (row in 0 until 8) {
        columnLoop@ for (column in 0 until 8) {
            if (row == column) {
                continue@rowLoop
            }
           sum += row * column
        }
    }
    //mini exercises
    // When expressions
    // You can also control flow via the when expression it executew d9fferent code depending on the value of a variable or constant 
    val number1 = 10 
    when (number1) {
        0 -> println("Zero")
        else -> println("Non-zero")
    }
    // to handle a specific case, you add the value followed by -> which indicates the code will execute if the condition is met 
    when (number1) {
        10 -> println("Its ten")
    }
    val string = "Dog"
    when (string) {
        "Cat","Dog" -> println("Animal is a house pet.")
        else -> println("Animal is not a house pet.")
    }
    // You can also give your when expressions more than one branch , and because its an expression you can use it to return a value 
    val numberName = when (number) {
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else -> {
            println("Unknown number")
            "Unknown"
        }
    }
    println(numberName)
    // Advanced when expressions 
    val hourOfDay = 12
    val timeOfDay:String

    timeOfDay = when(hourOfDay) {
        0, 1, 2, 3, 4, 5 -> "Early morning"
        6, 7, 8, 9 , 10 , 11 -> "Morning"
        12, 13, 14, 15, 16 -> "Afternoon"
        17, 18, 19 -> "Evening"
        20, 21, 22, 23 -> "Late Evening"
        else -> "INVALID HOUR!"
    }
    println(timeOfDay)
    // Using expressions with ranges 
    val hourOfDay1 = 7
    val timeOfDay1 : String

    timeOfDay1 = when(hourOfDay1) {
        in 0..5 -> "Early Morning"
        in 6..11 -> "Morning"
        in 12..16 -> "Afternoon"
        in 17..19 -> "Evening"
        in 20..23 -> "Late Evening"
        else -> "INVALID HOUR"
    }
// when there are multiple branches the expression will execute the first one that matches 
// Using when expressions with conditions 
 when {
    number % 2 == 0 -> println("Even")
    else -> println("Odd.")
 }
 // Another example of using conditions in when expressions 
 val (x4, y4 , z4) = Triple(3,2,5)

 when {
    x4 == 0 && y4 == 0 && y4 == 0 -> println("Origin")
    y4 == 0 && z4 == 0 -> println("On the x-axis at x = $x4")
    x4 == 0 && y4 == 0 -> println("On the y-axis at y = $y4")
    x4 == 0 && y4 == 0 -> println("On the z-axis at z = $z4")
}
when {
    x4 == y4 -> println("Along th y = x line")
    y4  == x4 * x4 -> println("Along the y = x^2 line")
}
//Mini exercises 
//Challenges 

//Functions 
 fun printMyName() {
    println("My name is Joe Howard")
 }
 // function parameters
 fun printMultipleOfFive(value:Int) {
    println("$value * 5 = ${value * 5}")
 }

 printMultipleOfFive(10)

 fun printMultipleOf(multiplier : Int, value:Int = 1) {
    println("multiplier * $value = ${multiplier * value} ")
 }
printMultipleOf(4)

// Return values
fun multiply(number:Int, multiplier: Int):Int {
    return number * multiplier
}
// This function returns both the product and quotient of the two parameters by returning a Pair containing two Int values 
fun multiplyAndDivide(number:Int,factor:Int):Pair<Int,Int> {
    return Pair(number * factor, number / factor)
}
val (product,quotient) = multiplyAndDivide(4,2)

// If a function consists solely of a single exressio, you can assign the expression to the function using = while at the same time not using braces, a return type, or a return statement 
fun multiplyInferred(number:Int, multiplier:Int) = number * multiplier;

// function parameters are constants by default meaning they can't be modified , its equivalent to declaring the value parameter with val 

// fun incrementAndPrint(value: Int) {
//     value += 1
//     print(value)
// }
// this results in an error - value cannot be reassigned 
fun incrementAndPrint (value:Int):Int {
    val newValue = value + 1 ;
    println(newValue);
    return newValue;
}

//Overloading lets you define similar functions with the same name
// The return type alone is not enough for the compiler to dustinguish between two functions 
// It is ususally achived thorugh a difference in parameter list - 
// A different number of parameters 
// Different parameter types 


fun getValue(value:Int): Int {
    return value + 1 
}
fun getValue(value:String):String {
    return " The value is $value "
}
//declaring this one gives an error 
// fun getValue(value:String):Int {
//     return value.length
// }
// Mini exercises 

fun printFullName(firstName:String,lastName:String) {
    println("$firstName $lastName")
}
printFullName("Timothy","Blake")

fun calculateFullName(firstName:String,lastName:String):String {
    val fullName =  "$firstName $lastName"
    return fullName
}
calculateFullName("rumuokoro","ojekwe")

fun calculateFullName(fullName:String):Pair<String,Int> {
    val fullName =  "$fullName"
    val len = fullName.length
    return Pair(fullName,len)
}
calculateFullName("ovwevwevwevwevwvwe")

//Functions as variables 
// functions in kotlin are simply another data type , you can asisgn them to variables 
fun addInt(a:Int,b:Int):Int {
    return a + b 
}

// You can assign the function to the variable using the method reference operator 
var function = ::addInt 

// here the name of the variable is function and its type is inferred as (Int,Int)-> Int
// Now you canuse function just like you would use add
function(4,2)

fun subtract(a:Int,b:Int):Int {
    return a - b 
}
// You can set the function variable from before to your new subtract function, because the parameter list and return type of subtract are compatible with the type of the function variable 
function = ::subtract 

function(4,2)

//The fact that you can assign functions to functions come in handy because it means you can pass funcitons to other functions 
// Its extremely useful to be able to pass functions to other functions it can help you write resuable code 
//Assigning functions to varibales and p[assing function to other funcitons is one aspect of functional programming 

fun printResult(function:(Int,Int) -> Int, a: Int, b: Int) {
    val result = function(a,b)
    print(result)
}
printResult(::addInt,4,2);

//PrintResult calls the passed in function, passing into it the two Int parameters , then it prints the result to the console 

//Challenges 

}

//If we put it inside the main method or inside a class, it will give the error -  Modifier 'const' is not applicable to 'local variable'


const val reallyConstant : Int = 42 


// Variables 

var variableNumber : Int = 42 ;

// You declare constants using val, while you declare variables using var 

//once you have declared a variables , you can change it however you wish you simply reassign its value 

// in kotlin, you can use underscores to amke larger numbers more human readable 



