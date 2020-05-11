/*
Issue #136
This week's question:
Given a sorted array of characters, compress it in-place.

Example:
compress(["a","a","b","b","b","c","c"])
> ["a2","b3","c2"]
// "aa" is replaced by "a2", "bbb" is replaced by "b3", "cc" is replaced by "c2".
*/

fun main() {
    val input = "auhywaavvvdduhywddihhiyiwwwi".toCharArray().apply { sort() }
    println(compress(input))
    println(compress("aabbbcc".toCharArray()))
}

fun CharArray.getString(): String {
    val str = StringBuilder()
    this.forEach { str.append(it.toString()) }
    return str.toString()
}

fun compress(charArray: CharArray): List<String> {
    val lowercaseCharArray = charArray.getString().toLowerCase().toCharArray()
    val allCharacters = lowercaseCharArray.toSet()
    val mutableMapOfCharArray = mutableMapOf<Char, Int>()
    var count = 0

    if (allCharacters.size == charArray.size)
        for (char in allCharacters) {
            val str = String(charArray)
            count = str.lastIndexOf(char) - str.indexOf(char) + 1
            mutableMapOfCharArray[char] = count
        }

    allCharacters.forEach { char ->
        lowercaseCharArray.forEach { if (char == it) ++count }
        mutableMapOfCharArray[char] = count
        count = 0
    }

    return mutableMapOfCharArray.map { "${it.key}${it.value}" }
}