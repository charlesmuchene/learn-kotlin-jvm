package com.charlesmuchene.kotlin

class Play {

    fun playground() {

        // Variable declaration (and initialization)
        // val|r <name>[:Type] = <value>

        val school: String = "GreenFields"

        //school = "RiverFront"


        // Nullable types

        val name: String? = null // nullable type

        //val length = name.length

        val length = name?.length ?: 0

    }
}