// Issue #1: Write a function that takes in a number from 1 to 1000 and returns that number in Roman Numerals.

fun getRomanNumerals(num: Int): String {
    val digits = num.toString().reversed().toCharArray()
    var romanNumber = ""
    for ((i, digit) in digits.withIndex())
        romanNumber = getNumeralForSignificantDigits(i, digit) + romanNumber

    return romanNumber
}

fun getNumeralForSignificantDigits(index: Int, digit: Char): String = when (index + 1) {
    1 -> when (digit) {
        '1' -> "I"
        '2' -> "II"
        '3' -> "III"
        '4' -> "IV"
        '5' -> "V"
        '6' -> "VI"
        '7' -> "VII"
        '8' -> "VIII"
        '9' -> "IX"
        else -> ""
    }
    2 -> when (digit) {
        '1' -> "X"
        '2' -> "XX"
        '3' -> "XXX"
        '4' -> "XL"
        '5' -> "L"
        '6' -> "LX"
        '7' -> "LXX"
        '8' -> "LXXX"
        '9' -> "XC"
        else -> ""
    }
    3 -> when (digit) {
        '1' -> "C"
        '2' -> "CC"
        '3' -> "CCC"
        '4' -> "CD"
        '5' -> "D"
        '6' -> "DC"
        '7' -> "DCC"
        '8' -> "DCCC"
        '9' -> "CM"
        else -> ""
    }
    4 -> when (digit) {
        '1' -> "M"
        '2' -> "MM"
        '3' -> "MMM"
        '4' -> "Mv"
        '5' -> "v"
        '6' -> "vM"
        '7' -> "vMM"
        '8' -> "vMMM"
        '9' -> "Mx"
        else -> ""
    }
    5 -> when (digit) {
        '1' -> "x"
        '2' -> "xx"
        '3' -> "xxx"
        '4' -> "xl"
        '5' -> "l"
        '6' -> "lx"
        '7' -> "lxx"
        '8' -> "lxxx"
        '9' -> "xc"
        else -> ""
    }
    6 -> when (digit) {
        '1' -> "c"
        '2' -> "cc"
        '3' -> "ccc"
        '4' -> "cd"
        '5' -> "d"
        '6' -> "dc"
        '7' -> "dcc"
        '8' -> "dccc"
        '9' -> "dm"
        else -> ""
    }
    7 -> when (digit) {
        '1' -> "m"
        '2' -> "mm"
        '3' -> "mmm"
        '4' -> "4"
        '5' -> "5"
        '6' -> "6"
        '7' -> "7"
        '8' -> "8"
        '9' -> "9"
        else -> ""
    }
    else -> "TOO BIG "
}

fun main() {
    var num = 0
    var getValueFlag = true
    while (getValueFlag) {
        try {
            val temp = readLine()?.toInt()!!
            if (!(1..1000).contains(temp)) throw InputOutOfRangeException()
            num = temp
            getValueFlag = false
        } catch (e: Exception) {
            when (e) {
                is NumberFormatException -> println("Please enter an integer value")
                is InputOutOfRangeException -> println("Number must lie between 1 to 1000")
            }
        }
        println(getRomanNumerals(num))
    }
}