package org.eifr.dsm

fun main() {
    paso1de8()
    println("/" + "*".repeat(40) + "/")
    paso2de8()
}

fun paso1de8() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

fun displayAlertMessage(os: String = "Unknown OS", email: String) : String {
    return "There's a new sign-in request from $os for your Google Account $email."
}

fun paso2de8() {
    println(displayAlertMessage(email = "user_one@gmail.com"))
    println(displayAlertMessage("Windows", "user_two@gmail.com"))
    println(displayAlertMessage(os = "Mac OS", email = "user_three@gmail.com"))
}