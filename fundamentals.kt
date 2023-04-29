
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
} 
//If we put it inside the main method or inside a class, it will give the error -  Modifier 'const' is not applicable to 'local variable'


const val reallyConstant : Int = 42 


// Variables 

var variableNumber : Int = 42 ;

// You declare constants using val, while you declare variables using var 

//once you have declared a variables , you can change it however you wish you simply reassign its value 

// in kotlin, you can use underscores to amke larger numbers more human readable 


