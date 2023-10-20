package com.example.kotlinbasics.secondaryConstructor6
class Player: Person {
    // secondary constructor
    // secondary constructor is created using "constructor" keyword
    // secondary constructor is used to initialize the properties of the class
    constructor(name: String, age: Int, game: String): super(name, age) {
        // super keyword is used to call the primary constructor of the super class with a : (colon) symbol
        println("Player name is $name")
        println("Player age is $age")
        println("Player is playing $game")
    }
}