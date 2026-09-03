package org.eifr.dsm

fun main() {
    val steps = 4000 // camel case inicia con minúscula
    val caloriesBurned = convertPedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

// se cambió de PEDOMETERstepsTOcalories
// a convertPedometerStepsToCalories
// es un verbo y usa camel case
fun convertPedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}