package com.example.kotlinbasics

import java.util.Locale

fun main()
{
    // this is a comment
    println("Learning Kotlin Basics")
    print("Hello World")
    // function call
    variables()
    stringFnc()
    conditional()
    whenExp()
    looping()
    arrayfun()
    ranges()
}

fun variables()
{
    // Variables
    var name = "John" // mutable "var"    // String
    val age = 25 // immutable "val"      // Int
    var isAlive = true // Boolean
    var marks = 97.4 // Double/Float
    println("Name: $name")
    println("Age: $age")
    println("isAlive: $isAlive")
    println("Marks: $marks")
}

fun stringFnc()
{
    var text = "A text for demo of String Functions."
    var text2 = "A text in \"Kotlin\" ."

    println(text[4]) // accessing a character in a string
    println(text.length) //get length of string
    println(text.toUpperCase(Locale.ROOT)) //convert string to upper case
    println(text.compareTo(text2)) //compare both the string  //output: -3 because "f" and "i" has difference of 3
    println(text.indexOf("mo")) //get index of particular string
    println(text + text2) //concatenation
}

fun conditional()
{
    if(2>1){
        println("condition true then if executed")
    } else if(3>4) {
        println("else-if block executed if it is true and if condition is false.")
    }else{
        println("if condition is false then this block is executed")
    }
}

fun whenExp(){
    // when expression is like switch in java.
    val day = 4

    val result = when(day){
        1 -> "Mon"
        2 -> "Tues"
        3 -> "Wed"
        4 -> "Thurs"
        5 -> "Fri"
        6 -> "Sat"
        7 -> "Sun"
        else -> "no above case matched the input"
    }
    println(result)
}

fun looping(){
    var i =0
    while(i<5){   //while loop
        if(i==2) {
            println("loop will break because of break statement")
            break
        }
        print("this loop will run as i = ")
        println(i)
        i++
    }
    println("out of loop as i = $i")
    i=5
    do {
        // will always run at least once
        if(i==2) {
            println("loop will skip $i because of continue statement")
            i--
            continue
        }
        print("in a loop as i != ")
        println(i)
        i--
    }while (i!=0)
}

fun arrayfun() {
    val num = arrayOf(1,2,6,4)//initialize an array
    println(num[1])
    println(num.size) // gives the no. of elements in array
    if(1 in num){  //in operator is used to check if an element is present or not
        println("present")
    }
    for(i in num){  //print all elements in an array
        print(i)
    }
}

fun ranges() {
    // range is denoted by ".."
    for(x in 1..20){  //both 1 & 20 are included
        println(x)
    }
}
