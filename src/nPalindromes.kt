/*
This week's question:
Given a number n, find the sum of all n-digit palindromes.

Example:
> nPalindromes(2)
> 495 // 11 + 22 + 33 + 44 + 55 + 66 + 77 + 88 + 99
*/

import kotlin.system.exitProcess

fun main() {
    var nDigits = 0
    var getValueFlag = true
    while (getValueFlag) {
        try {
            val temp = readLine()?.toInt()!!
            nDigits = temp
            getValueFlag = false
        } catch (e: NumberFormatException) {
            println("Please enter an integer value")
        }
    }
    println(nPalindromes(nDigits))
}

fun nPalindromes(nDigits: Int): Long = nSum(nDigits)

fun nSum(nDigits: Int): Long = getNums(nDigits).sum()

fun getNums(nDigits: Int): List<Long> {
    val numbers = mutableListOf<Long>()
    for (i in 1 until 10) {
        var string = "$i"
        var j = 1
        while (j < nDigits) {
            string += "$i"
            ++j
        }
        try {
            numbers.add(string.toLong())
        } catch (e: NumberFormatException) {
            println("The number of digits is too long for evaluation. Please try a smaller number.")
            exitProcess(0)
        }
    }
    return numbers.toList()
}
