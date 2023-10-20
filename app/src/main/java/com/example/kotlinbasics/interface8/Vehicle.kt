package com.example.kotlinbasics.interface8

interface Vehicle {
    val speed: Int

    fun start(): String  // abstract method by default in interface class
    fun stop(){
        println("Vehicle Stopped")
    }
}

//