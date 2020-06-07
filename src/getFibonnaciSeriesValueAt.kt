/** Function to get the Fibonacci series value at a given index
 * @author Neeyat Lotlikar
 * @param n index in the series whose value is to be returned
 * @return value at the nth index in the Fibonacci series
 * @throws IllegalArgumentException when a value less than 1 is passed in as the index argument*/
fun getFibonaccciSeriesValueAt(n: Int): Long {
    if (n < 0) throw IllegalArgumentException("n cannot be less than 1. Indices are natural numbers.")
    var value = 1L // Initial: value at index 1
    var prev = 0L // Initial: value at index 2
    if (n == 1) return prev // Initial first value
    if (n == 2) return value // Initial second value
    var i = 3
    while (i <= n) { // Calculate for value at index 3 and onwards
        value += prev // Find the next value
        prev = value - prev // Find the value preceding it
        ++i
    }
    return value
}

/** To test the getFibonaccciSeriesValueAt(n: Int): Long function
 * @see getFibonaccciSeriesValueAt */
fun main() {
    for (i in 1..12)
        println("index: $i, value: ${getFibonaccciSeriesValueAt(i)}")
}