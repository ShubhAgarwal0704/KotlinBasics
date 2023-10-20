package com.example.kotlinbasics.abstractClass7

class Student(name: String, age: Int): Person() {
    // Error: Class 'Student' is not abstract and does not implement abstract base class member public abstract fun displayAge()
    // Implement the abstract function displayAge() in the child class Student
    override fun displayAge() {
        println("Age is: $age")
    }
}