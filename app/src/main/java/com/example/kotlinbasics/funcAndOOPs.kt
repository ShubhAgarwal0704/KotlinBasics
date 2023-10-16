package com.example.kotlinbasics

fun main(){
    firstFunc()//function call
    parameterFun("Shubh",100)  //value "Shubh" & "100" passed
}

fun firstFunc(){
    println("Hello")
}

fun parameterFun(fname : String, code : Int){
    println("hello $fname")
    println("code: $code+2 = " + (code+2))
}