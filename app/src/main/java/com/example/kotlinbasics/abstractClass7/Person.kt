package com.example.kotlinbasics.abstractClass7

abstract class Person{  // Abstract class using "abstract" keyword
    var name: String = "John"
    var age: Int = 30

    fun displayName(){  // Non-abstract function can have body
        println("SName is: $name")
    }

    abstract fun displayAge()  // Abstract function cannot have body
}