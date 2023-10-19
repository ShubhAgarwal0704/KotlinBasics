package com.example.kotlinbasics.inheritanceExample5

fun main(){

    var play1 = Player("Aman", 20, "Cricket")  // play1: object of Player class

    //init block output:
    //Person name is Aman
    //Person age is 20

    play1.eat()  //Aman is eating. He is 20 years old.
    play1.sleep()  //Aman is sleeping. He is 20 years old.
    play1.talk()  //Aman is talking. He is 20 years old.
    play1.play()  //Aman is playing Cricket.

    var teach1 = Teacher("Maths", "Sam", 25)  // teach1: object of Teacher class

    //init block output:
    //Person name is Sam
    //Person age is 25

    teach1.eat()  //Sam is eating. He is 25 years old.
    teach1.sleep()  //Sam is sleeping. He is 25 years old.
    teach1.talk()  //Sam is talking. He is 25 years old.
    teach1.teach()  //Sam is teaching Maths.

    var person1 = Person("John", 30)  // person1: object of Person class

    //init block output:
    //Person name is John
    //Person age is 30

    person1.eat()  //John is eating. He is 30 years old.
    person1.sleep()  //John is sleeping. He is 30 years old.
    person1.talk()  //John is talking. He is 30 years old.
}

// Output:
//Person name is Aman
//Person age is 20
//Aman is eating. He is 20 years old.
//Aman is sleeping. He is 20 years old.
//Aman is talking. He is 20 years old.
//Aman is playing Cricket.
//Person name is Sam
//Person age is 25
//Sam is eating. He is 25 years old.
//Sam is sleeping. He is 25 years old.
//Sam is talking. He is 25 years old.
//Sam is teaching Maths.
//Person name is John
//Person age is 30
//John is eating. He is 30 years old.
//John is sleeping. He is 30 years old.
//John is talking. He is 30 years old.