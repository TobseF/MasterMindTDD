package de.tfr.dojo.mastermind

/**
 * Sample game template in Kotlin.
 * Feel free to change or delete it.
 *
 * Sample test: MasterMindTest
 * Java version: MindMaster
 */
class MasterMind {
    fun game() = "Master Mind"

    private fun readLineFomConsole(): String = readLine()!!

    fun runGame() {
        println("Your Input:")
        val userInput = readLineFomConsole()
        println("Typed: $userInput")
    }
}

fun main() {
    MasterMind().runGame()
}