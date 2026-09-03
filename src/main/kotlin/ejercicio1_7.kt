package org.eifr.dsm

fun main() {
    paso1de7()
    println("/" + "*".repeat(40) + "/")
    paso2de7()
    println("/" + "*".repeat(40) + "/")
    paso3de7()
}

fun paso1de7() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber // se creó esta variable
    println("$firstNumber + $secondNumber = $result")
}

fun paso2de7() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

}

fun add(a: Int, b: Int) : Int {
    return a + b
}

fun subtract(a: Int, b: Int) : Int {
    return a - b
}

fun paso3de7() {
    // paso 3 (usar subtract)
    val a = 5
    val b = 3
    println("$a - $b = ${subtract(a, b)}")
    println("$b - $a = ${subtract(b, a)}")
}