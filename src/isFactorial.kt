/*
* This week's question:
Given a number, return true if the input is a factorial of any natural number.

Example:
> isFactorial(3)
> false
> isFactorial(6)
> true
* */

fun main() {
    println("Enter a number to check whether it is a factorial of some number")
    var num = 0
    var getValueFlag = true
    while (getValueFlag) {
        try {
            val temp = readLine()?.toInt()!!
            num = temp
            getValueFlag = false
        } catch (e: NumberFormatException) {
            println("Incorrect input. Please enter an integer value.")
        }
    }
    println("isFactorial($num) : " + isFactorial(num))
}

fun isFactorial(num: Int): Boolean {
    var i = 0
    var fact = 1
    while (fact < num) {
        fact = findFactorial(i)
        if (num == fact)
            return true
        ++i
    }
    return false
}

fun findFactorial(n: Int): Int {
    return when (n) {
        0 -> 1
        else -> n * findFactorial(n - 1)
    }
}