package com.example.kotlinbasics.abstractClass7

fun main(){
    // Abstract classes are open by default and can have abstract and non-abstract properties and functions.
    // Abstract classes cannot be instantiated.
    // Abstract properties and functions are 'open' by default and you can override them in the child class.
    // Abstract classes can have constructors, init blocks and final properties and functions.

//    var p1 = Person()  // Error: Cannot create an instance of an abstract class

    var s1 = Student("John", 30) // Create an instance of the child class Student
    s1.displayName()
    s1.displayAge()
}