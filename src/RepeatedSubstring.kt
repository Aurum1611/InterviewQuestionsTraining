/*
* This week's question:
Given strings n and m, find the minimum number of times n has to be repeated such that m is a substring of it
(and if it's not possible, return -1).

Example:
> repeatedSubstring('abcd', 'cdabcdab')
> 3 // When you repeat n 3 times, it becomes 'abcdabcdabcd', and m isn't a substring of n when it's repeated less than 3 times

> repeatedSubstring('ab', 'cab')
> -1

* */

fun repeatedSubstring(n: String, m: String): Int {
    // Make sure all the symbols match for starters
    val nSet = n.toCharArray().toSet()
    val mSet = m.toCharArray().toSet()
    if (!mSet.containsAll(nSet) || !nSet.containsAll(mSet)) return -1

    // Since it's possible, join n together and check whether m is a substring of it
    val nSuperString = StringBuilder(n)
    var count = 1 // We are counting the n's and not the number of concatenations
    while (!nSuperString.contains(m)) {
        nSuperString.append(n)
        count++
    }
    return count
}

fun main() {
    println(repeatedSubstring("ab", "cab"))
    println(repeatedSubstring("abcd", "cdabcdab"))
}