package com.example.kotlinbasics.secondaryConstructor6

open class Person {
    // secondary constructor
    // secondary constructor is created using "constructor" keyword
    // secondary constructor is used to initialize the properties of the class
    constructor(name: String, age: Int) {
        println("Player name is $name")
        println("Player age is $age")
    }
}