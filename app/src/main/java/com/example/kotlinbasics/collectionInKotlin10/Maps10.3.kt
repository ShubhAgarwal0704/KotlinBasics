package com.example.kotlinbasics.collectionInKotlin10

fun main(){
    // Maps: Collection of key-value pairs in which each key is unique and is used to retrieve the corresponding value.

    // Immutable Map
    val immutableMap = mapOf(1 to "Kotlin", 2 to "Java", 3 to "C++", 4 to "Python", 5 to 500, 600 to 500, 7 to true)
    // Immutable Map using mapOf() function where key is of type Int and value is of type Any

    // 2 keys with same value are unique and hence both are printed
    println("Immutable Map: $immutableMap")

    for(key in immutableMap.keys){
        println("Value of key $key is ${immutableMap[key]}") // Printing value of each key
    }

    for(item in immutableMap){
        println(item)
    }

    // Mutable Map
    var mutableMap = mutableMapOf(1 to "Kotlin", 2 to "Java", 3 to "C++", 4 to "Python", 5 to 500, 6 to 500, 100 to true)
    // Mutable Map using mutableMapOf() function where key is of type Int and value is of type Any

    println("Mutable Map: $mutableMap")

    // Adding elements to the map
    mutableMap.put(8, "C#") // Adding key-value pair to the map

    // Removing elements from the map
    mutableMap.remove(2) // Removing key-value pair from the map

// Updating elements in the map
    mutableMap[1] = "Dart" // Updating value of key 1

    for(key in mutableMap.keys){
        println("Value of key $key is ${mutableMap[key]}") // Printing value of each key
    }

    for(item in mutableMap){
        println(item)
    }
}