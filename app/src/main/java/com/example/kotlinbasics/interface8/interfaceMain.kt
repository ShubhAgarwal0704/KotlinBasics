package com.example.kotlinbasics.interface8

// Interface is a contract that a class can implement and provide the expected behavior.
// Interface can have abstract methods and properties.
// Interface can have default implementations for methods and properties.
// Interface can have abstract and non-abstract properties and methods.

fun main(){
    val car = Car()
    println(car.start())
    car.stop()
}