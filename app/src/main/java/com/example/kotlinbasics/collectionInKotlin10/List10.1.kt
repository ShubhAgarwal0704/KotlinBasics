package com.example.kotlinbasics.collectionInKotlin10

// Data Structures in Kotlin are of two types: Mutable and Immutable
// Immutable Data Structures are those data structures whose state cannot be changed once created.
// Mutable Data Structures are those data structures whose state can be changed once created.

// Types of Immutable Data Structures in Kotlin are as follows:
// Immutable List
// Immutable Set
// Immutable Map

// Types of Mutable Data Structures in Kotlin are as follows:
// Mutable List
// Mutable Set
// Mutable Map

fun main(){
    // Lists: Ordered collection in which each element
//            is accessible by using indices that define
//            position of each element in the list.

    // Immutable List
    val immutableList = listOf<String>("Kotlin", "Java", "C++", "Python")   // Immutable List using listOf() function
    for(item in immutableList){
        println(item)
    }
    println("Immutable List: $immutableList")

    // Mutable List
    var mutableList = mutableListOf<String>("Kotlin", "Java", "C++", "Python")  // Mutable List using mutableListOf() function

    println("Mutable List: $mutableList")

    // Adding elements to the list at location 2
    mutableList.add(2,"C#")
    // Adding elements to the list
    mutableList.add("JavaScript")

    // Removing elements from the list
    mutableList.remove("Java")

    // Updating elements in the list
    mutableList[0] = "Dart"

    for(item in mutableList){
        println(item)
    }
}