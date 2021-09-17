package com.example.firstapp

fun main(){
    //immutable variable. Cannot be changed when instantiated
    //TODO: Add new functionality

    /*
    This is a multiline comment
     */


    val myName = "Kurz"
    //  type int 32 bit
    // type inference finds out the type from context
    var myAge = 31


    // Integer TYPES: Byte(8 bit) ,Short (16 bit),
    // Int (32 bit ), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120

    // Floating Point number Types: Float(32 bit), Double(64 bit)
    val myFloat: Float = 13.24F
    val myDouble: Double = 3.14159265358979323846

    //Booleans are used to represent logical values
    //It can have two possible values true and false
    var isSunny= true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '$'

    //Strings
    val myStr = "Hello World"
    var firstCharInstr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
   // print("Last character " + lastCharInStr)

    //Arithmetic operators ( + , -, *,%)
    var result = 5+3
    val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a / b
   // print(resultDouble)

    //Comparison operators (==, !=, < , > , <=, >=)
    val isEqual = 5==3
  //  println(" isEqual is $isEqual")

    val isNotEqual = 5 != 5
    // String Interpolation
   //   println("isNotEqual is $isNotEqual")

   // println("is5greater3 ${5>3}")
   // println("is5LowerEqual3 ${5<=3}")
   // println("is5GreaterEqual3 ${5>=3}")

    // Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4
   // println("myNum is  $myNum")

    //Increment & Decrement operators (++, --)
    myNum++
   // println("myNum is $myNum")
    //println("myNum is ${myNum++}")
   // println("myNum is ${++myNum}")
   // println("myNum is ${--myNum}")

    var heightPerson1 = 170
    var heightPerson2 = 189


 // if statements
    if(heightPerson1 > heightPerson2){
        println("use raw force")
    }else if(heightPerson1 == heightPerson2){
        println("use your power technique 1337")
    }else{
        println("use technique")
    }

    val sge = 17

}