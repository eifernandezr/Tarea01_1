package org.eifr.dsm

fun main() {
    var a: Int
    var b: Int
    a = 300
    b = 250
    println("timeSpentToday = $a and timeSpentYesterday = $b, the function returns ${compareIntegers(a, b)} value")
    b = 300
    println("timeSpentToday = $a and timeSpentYesterday = $b, the function returns ${compareIntegers(a, b)} value")
    a = 200
    b = 220
    println("timeSpentToday = $a and timeSpentYesterday = $b, the function returns ${compareIntegers(a, b)} value")
}

fun compareIntegers(a: Int, b: Int) : Boolean {
    return a > b
}