package com.example.kotlinbasics.interface8

class Car() : Vehicle {  // Car class implements Vehicle interface
    override val speed: Int = 60
    override fun start(): String { // abstract method in interface class must be implemented in child class or else it will give error
        return "Car Started"
    }
    override fun stop() { // non-abstract method in interface class can be implemented in child class or else it will take default implementation
        super.stop()
        println("Car Stopped")
    }
}