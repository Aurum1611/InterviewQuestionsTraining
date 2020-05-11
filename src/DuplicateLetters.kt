/*
Write a function that takes in a string and returns the first duplicate character it finds.
Bonus points: write another function that takes in a string and removes all the duplicate characters.
*/

fun getFirstDuplicate(str: String): Char {
    val characters = str.toCharArray().toSet()
    for (char in characters) {
        if (str.indexOf(char) != str.lastIndexOf(char))
            return char
    }
    throw NoDuplicateException()
}

class NoDuplicateException(override val message: String = "No duplicate character was found in the string") :
    Exception(message)

fun removeAllDuplicates(str: String): String = str.toCharArray().toSet().fold("") { s, char -> "$s$char" }

fun main(){
    println(getFirstDuplicate("JackSparrow"))
    println(removeAllDuplicates("JackSparrow"))
    println(getFirstDuplicate("Almond"))
}