package com.example.kotlinbasics.inheritanceExample5

// Teacher class is inherited from Person class using ":" symbol
// Teacher class is a sub class of Person class
class Teacher(var subject: String, name: String, age: Int) : Person(name, age) {
    fun teach() {
        // function teach() accessed only by Teacher class objects and not by Person class objects
        println("$name is teaching $subject.")
    }
}