package com.example.kotlinbasics.inheritanceExample5

// Player class is inherited from Person class using ":" symbol
// Player class is a sub class of Person class
class Player(name: String, age: Int, var game: String) : Person(name, age) {
    fun play() {
        // function play() accessed only by Player class objects and not by Person class objects
        println("$name is playing $game.")
    }
}