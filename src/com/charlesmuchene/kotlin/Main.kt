package com.charlesmuchene.kotlin

fun main() {
    val student = Student("Charles Kotlin", 23, "Home Street")
    println(student)

    Singleton.initialize()
    val lapseTime = Singleton.getLapseTime()
    println("Lapsed time is: $lapseTime")

}