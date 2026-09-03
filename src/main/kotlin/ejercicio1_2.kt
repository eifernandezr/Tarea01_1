package org.eifr.dsm
/*
* Use the val keyword when the value doesn't change.
* Use the var keyword when the value can change.
* When you define a function, you define the parameters that can be passed to it.
* When you call a function, you pass arguments for the parameters.
* */

var attempt = 1
fun main() {
    printSimpleMultilineMessage()

    val number = 2
    printGreetingToName(name = "Eddy", number = number)
    printGreetingToName(name = "Eddy", number = number)
    printGreetingToName(name = "Eddy", number = number)
}


fun printGreetingToName(greeting: String = "Hi", name: String, number: Int) {
    println("$greeting, $name. This is the exercise #$number (attempt #${attempt++})")
}

fun printSimpleMultilineMessage() {
    println("""
        Use the val keyword when the value doesn't change.
        Use the var keyword when the value can change.
        When you define a function, you define the parameters that can be passed to it.
        When you call a function, you pass arguments for the parameters.
    """.trimIndent())
}
