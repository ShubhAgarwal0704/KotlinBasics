package com.example.kotlinbasics.inheritanceExample5


// super class Person created using "open" keyword
// input parameters are name and age
// "Person" class is inherited by "Player" and "Teacher" class
open class Person(var name: String, var age: Int) {
    //use of init block is
    //The code inside the init block is the first to be executed when the class is instantiated.
    //The init block is used to initialize the properties of the class.
    init {  // here init block is used to print the name and age of the person
        println("Person name is $name")
        println("Person age is $age")
    }
    // functions eat(), sleep() and talk() are also accessed by Player and Teacher class objects
    fun eat() {
        println("$name is eating. He is $age years old.")
    }
    fun sleep() {
        println("$name is sleeping. He is $age years old.")
    }
    fun talk() {
        println("$name is talking. He is $age years old.")
    }
}