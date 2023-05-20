# Kotlin

Kotlin is a highly effective modern programming language developed by jetBrains

Primary goal of the kotlin project was to provide a safer and more concise alternative to Java
It is a MultiPlatform language

JVM - it Is fully interoperable with java which means kotlin works with existing java code and libraries , it also allows companies to make gradual migration from java to kotlin code because java code can access kotlin code , at the same time , you can use kotlin as the only language for your project without Java

Android - you can create mobile applications for the most used operating system in the world
Js - kotlin is also compatible with JavaScript, which enables you to develop client side web applications that can be run in the browser

Native - Kotlin code can be converted into a file that can be run in any OS\

Kotlin is designed as a pragmatic language, which means that its main purpose is solving real-world problems rather than completing research purposes.

It is also important that Kotlin supports multiple programming paradigms, such as imperative programming, object-oriented programming, generic programming, functional programming, and more. You will learn about these paradigms throughout the course.
To write strings , we wrap characters in double quotes instead of single ones

A character should be wrapped n single quotes while a string should e wrapped in double quotes

BASIC CODE TERMINOLOGY

* A program is a sequence of instructions (called statements), which are executed one after another in a predictable manner. Sequential flow is the most common and straightforward situation when statements are executed in the order they are written, i.e., from top to bottom, one after another;
* A statement (or a programming statement) is a single command to be executed (like printing a text);
* An expression is a piece of code that produces a single value (for example, 2*2 is an expression);
* A block is a group of zero or more statements enclosed in a pair of curly braces {...}; our program consists of a single block;
* A keyword is a word that has a special meaning in the programming language. Names of keywords can't be changed;
* An identifier (or a name) is a word written by the programmer to identify something;
* A comment is a piece of text that is ignored when executing the program – it just explains a part of the code. Comments start with //;
* Whitespace is a blank area, a tab, or a newline; it is used to separate words in the program and to improve readability.

Println - this function prints a statement followed by a newline character

Print displays a value and puts the cursor after

The computer stores the numbers it acts upon in small memory units called registers

In kotlin with its origins as a language on the Java Virtual Machine or VM there is an extra layer between the compiler and the OS . The kotlin compiler creates what is known as byte code which get run on the JVOM and gets converted to native code along the way  
Kotlin began on the JVM but now it is possible to compile kotlin directly to native code

 System ruby is currently used - error when running kdoctor

<https://www.freecodecamp.org/news/do-not-use-mac-system-ruby-do-this-instead/>

<https://mac.install.guide/ruby/index.html>

Make the hombrew installed ruby a higher priority than the system ruby
<https://mac.install.guide/ruby/13.html>

An introduction to Macs terminal
<https://medium.com/@JuxtaposedWords/b6acd3794d7c>

Using kotlin compiler
<https://medium.com/@ddmendes/using-kotlin-from-cli-on-mac-4560b5c70604>

<https://stackoverflow.com/questions/50636898/how-to-setup-the-kotlin-compiler>



// <https://developer.android.com/courses/kotlin-bootcamp/overview>
//Kotlin Apprentice
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

## String templates

    val messageTemplate = "hello my name is $name"
    println(messageTemplate)

    val oneThird = 1.0 / 3.0

    val oneThirdLogString = "one third is $oneThird as a decimal";

    val oneThirdLogString1 = "one third is ${1.0 / 3.0} as a decimal"

    // for the one thrid value, its result in the stirng temlate will be 0.33333333333333333, because it takes infinite characters to represent one third as a decimal , because it is a preating number 

    // that one of the disadvantages of template strings, it offers no way to customize the output 

## Multi line Strings

    val bigString = """
    | you cna have
    | a string that
    |contains multiple ines
    |by doing this.
    """.trimMargin()
    //The pipe hcaracter at the start of each kine prevents the stirng from having leading spaces
    print(bigString)

## Pairs and Triples

    // Sometimes data comes in groups e.g a pair of (x,y) coordinates on a 2d grid 
    //SImlarly a set of coorodinates on a 3d grid is comprised of an xvalue a yvalue and a z value'
    // in kotlin we can represent these types of data using a Pair or a Triple (other languages use a type called tuple)
    // if you want to have more than three vaues you use what kotlin calls a data class 

    val coordinates: Pair<Int, Int> = Pair(2,3)

    // leveraging on type inference 
    val cooridnatesInferred = Pair(2,3)

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

## Triples

    val coordinates3D = Triple(1, 3, 5)

    // destructuring declaration
    val (x3, y3, z3) = coordinates3D

    val x4 = coordinates3D.first
    val y4 = coordinates3D.second
    val z4 = coordinates3D.third

    // if you want to ignore a certain element of a Pair or Triple, you can replace the space its uspposed to occupy (corresponding part of the variable in the declaration) with an underscore 
    val(x5,y5, _) = coordinates3D

    //Number Types 
    //primitives require less memory - they are better for performance , but they also lack some of the features of Integer , in Kotlin you don;t have to worry whether you are using a primitive type or an objct type, kotlin handles that complexity for you 

    // You have been using double to represent fractional numbers, Kotlin offers a Float type that has lessr anrge and precision but occupies or has less sotrage size , regardless of that odern ahradware has been optimized for Doubles , so use doubles unless ypu have a good reason not to 

    val a : Short = 12
    val b : Byte = 120
    val c : Int = -10000000

    val answer = a + b + c 

    //answer will be in Int 
    println(answer)

## Any , Unit and Nothing Types

    // The any type can be thought of as the mother of all types (except nullable types) any other type like Integer or String can still be considered as Any 
    
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
    // Nothing is a type that is helpful for declaring that a function not only doesn't return anything but also never completes 

## dont confuse the terms "parameter" and "argument". A function declares its parameters in its parameter list. When you call a function you provide values as arguments for the functions parameters


## functions

### The land of no return

 There are some functions that are designed to never evr return , this may sound odd, but an exmale can be a function designed to crash an application , for what reason you might ask? well ,consider a situation where an application is about to work with corrupt data , it is better to crash the aplication tahn to let it continue in a dangerous and unknown state

 Another example of a non returning function is one which handles an event loop , it services requests frm the user , then passes these events to the application code , and that causes the information to be displayed on the screen. 
 The loop then cycles back and services the next event 

 Kotlin has a way of telling the compiler a function should never return - this is by setting the return type to Nothing 

This can be a simple implementation of it -

fun infiniteLoop(): Nothing {
    while(true) {

    }
}


