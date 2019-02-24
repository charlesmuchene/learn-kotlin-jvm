package com.charlesmuchene.kotlin

object Singleton {

    private var start = 0L

    fun initialize() {
        println("Initialize configuration")
        start = System.currentTimeMillis()
    }

    fun getLapseTime(): Long {
        return System.currentTimeMillis() - start
    }
}