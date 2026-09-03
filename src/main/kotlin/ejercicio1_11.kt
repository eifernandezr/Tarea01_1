package org.eifr.dsm

fun main() {
//    println("City: Ankara")
//    println("Low temperature: 27, High temperature: 31")
//    println("Chance of rain: 82%")
    printWeatherReport("Ankara",
        27, 31, 82)
    println()

//    println("City: Tokyo")
//    println("Low temperature: 32, High temperature: 36")
//    println("Chance of rain: 10%")
    printWeatherReport("Tokyo",
        32, 36, 10)
    println()

//    println("City: Cape Town")
//    println("Low temperature: 59, High temperature: 64")
//    println("Chance of rain: 2%")
    printWeatherReport("Cape Town",
        59, 64, 2)
    println()

//    println("City: Guatemala City")
//    println("Low temperature: 50, High temperature: 55")
//    println("Chance of rain: 7%")
    printWeatherReport("Guatemala City",
        50, 55, 7)
    println()
}

fun printWeatherReport(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
}