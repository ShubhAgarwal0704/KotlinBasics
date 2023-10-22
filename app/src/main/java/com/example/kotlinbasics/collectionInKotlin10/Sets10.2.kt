package com.example.kotlinbasics.collectionInKotlin10

fun main(){
    // Sets: Unordered collection in which each element
//            is unique and does not contain duplicate elements.
//            It is similar to the mathematical set.

    // Immutable Set
    val immutableSet = setOf("Kotlin", "Java", "C++", "Python", 1, 2, 2, 3, 4)   // Immutable Set using setOf() function
    for(item in immutableSet){
        println(item) // 1, 2, 3, 4 are printed only once as set does not contain duplicate elements
    }
    println("Immutable Set: $immutableSet")

    // Mutable Set
    var mutableSet = mutableSetOf("Kotlin", "Java", "C++", "Python", 100, 200, 200, 300)  // Mutable Set using mutableSetOf() function

    println("Mutable Set: $mutableSet")

    // Adding elements to the set
    mutableSet.add("C#") // Adding string value to the set
    mutableSet.add(true) // Adding boolean value to the set

    // Removing elements from the set
    mutableSet.remove("Java")

    for(item in mutableSet){
        println(item)
    }
}