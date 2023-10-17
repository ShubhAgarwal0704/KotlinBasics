package com.example.kotlinbasics

//Object oriented programming in Kotlin includes:
//1. Classes and Objects
// Classes are blueprints of objects and objects are real time entities.

//2. Constructors
// Constructors are used to initialize the properties of a class.

//3. Class Functions
// Functions are used to perform some action.

//4. Inheritance
// Inheritance is a mechanism in which one class acquires the property of another class.

//5. Polymorphism
// Polymorphism is the ability of an object to take on many forms.

//6. Encapsulation
// Encapsulation is the process of binding data members and member functions into a single unit.

//7. Interfaces
// An interface is a collection of abstract methods.

//8. Abstraction
// Abstraction is a process of hiding the implementation details and showing only functionality to the user.
class OopConcept3 {  //accessed in basicsKotlin1.kt

    //Attributes - Properties
    // variables that belong to the class
    var name = "Shubh"
    var year = 2023

    //Functions - behaviours
    fun greet(){
        println("Hello $name")
    }
    fun year(){
        println("Year is $year")
    }
}