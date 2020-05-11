/*
Issue #138
This week's question:
Given two strings n and m, return true if they are equal when both are typed into empty text editors.
The twist: # means a backspace character.

Example:
> compareWithBackspace("a##c", "#a#c")
> true      // both strings become "c"

> compareWithBackspace("xy##", "z#w#")
> true      // both strings become ""
*/

fun compareWithBackspace(s1: String, s2: String): Boolean = reduceBackspacedString(s1) == reduceBackspacedString(s2)

fun reduceBackspacedString(s: String): List<Char> {
    val reducedS = mutableListOf<Char>()
    s.toCharArray().forEach {
        if (it == '#' && reducedS.isNotEmpty()) reducedS.removeAt(reducedS.size - 1)
        else if (it != '#') reducedS.add(it)
    }
    return reducedS.toList()
}

fun main() {
    println(compareWithBackspace("a##c", "#a#c"))
    println(compareWithBackspace("xy##", "z#w#"))
}