/*Issue #3 This week's question:
Write a function that takes in two strings and returns true if they are anagrams.
* anagrams - of words A word or phrase that is created by rearranging the letters of another word or phrase.*/

fun compareForAnagram(s1: String, s2: String): Boolean {
    val s1List = s1.toLowerCase().toCharArray().toList().sorted()
    val s2List = s2.toLowerCase().toCharArray().toList().sorted()
    return s1List == s2List
}

fun main() {
    val string1 = readLine()!! // readLine() only returns null in file operations when the end of the file is reached
    val string2 = readLine()!!
    println(compareForAnagram(string1, string2))
}