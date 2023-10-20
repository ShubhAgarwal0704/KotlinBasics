package com.example.kotlinbasics

// Nested class is a class inside another class.
// Nested class can access all the members of outer class.
// Nested class can be declared as private or protected or internal or public.
// Nested class can be declared as static by using keyword "inner".
// Nested class can be instantiated without instantiating outer class.
// Nested class can be instantiated inside outer class.

class NestedClass9 {
    var name: String = "Nested Class"
    class SubClass {
        var len: Int = 10
        fun nestedMethod() {
            println("Nested Class Method")
        }
    }
}