/*
Write a function that takes in a string and reverses all the vowels in the string.
*/

val vowels = listOf('a', 'e', 'i', 'o', 'u')

fun reverseVowels(str: String): String {
    val result = StringBuilder()
    str.toCharArray().forEach { char: Char ->
        result.append(if (vowels.contains(char.toLowerCase())) replaceWithPreviousVowel(char) else char)
    }
    return result.toString()
}

fun replaceWithPreviousVowel(char: Char): Char =
    if (vowels.indexOf(char.toLowerCase()) > 0) vowels[vowels.indexOf(char.toLowerCase()) - 1] else vowels[vowels.size - 1]

fun main() {
    println(reverseVowels("I love burritos"))
}