/*
Issue #12
Write a function that takes in a number n, and prints n rows of Pascal's Triangle.
Hint: https://en.wikipedia.org/wiki/Pascal%27s_triangle
*/

fun printPascalsTriangle(n: Int) {
    for (i in 1..(n + 1))
        printRow(n, i)
}

fun printRow(n: Int, row: Int) {
    val middle = if (row % 2 == 0) row / 2 else (row / 2) + 1

    var i = 1
    var nextNumber = 0
    val rowMutableList = mutableListOf<Int>()

    while (i <= middle) {
        nextNumber += n
        rowMutableList.add(nextNumber)
        ++i
    }

    if (row % 2 == 0)
        rowMutableList.addAll(rowMutableList.reversed())
    else {
        val tempList = rowMutableList.toMutableList()
        tempList.removeAt(rowMutableList.lastIndex)
        rowMutableList.addAll(tempList.reversed())
    }

    rowMutableList.forEach { print("$it ") }
    println()
}

fun main() {
    printPascalsTriangle(7)
}