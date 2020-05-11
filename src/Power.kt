/*
Issue #19
Implement a power function to raise a double to an int power, including negative powers.
*/

fun power(num: Double, power: Int): Double {
    var result = 1.0
    var i = 0
    when {
        power > 0 -> {
            while (i < power) {
                result *= num
                ++i
            }
        }
        power < 0 -> {
            while (i < (-power)) {
                result /= num
                ++i
            }
        }
    }
    return result
}

fun main() {
    println(power(2.0, 5))
    println(power(2.0, -5))
    println(power(2.0, 0))
}