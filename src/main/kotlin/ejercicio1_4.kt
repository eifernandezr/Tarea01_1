package org.eifr.dsm

fun main() {
    var discountPercentage: Int = 0 // se cambió val por un tipo mutable
    val offer: String // se eliminó la primera inicialización. se mantuvo como val porque no hay otro cambio
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}