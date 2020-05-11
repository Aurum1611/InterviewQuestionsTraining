/*
* This week's question:
* Given that an "even word" is a word in which each character appears an even number of times,
* write a function that takes in a string and returns the minimum number of letters to be removed to make that string an even word.

Example:
evenWord('aaaa')
> 0

evenWord('potato')
> 2
* */

fun main() {
    val processingString = readLine()!!.toLowerCase()
    println(evenWord(processingString))
}

fun evenWord(word: String): Int {
    val letterHashMap = LinkedHashMap<Char, Int>()
    for (char in word.toCharArray()) {
        if (letterHashMap.isNotEmpty())
            if (letterHashMap.containsKey(char))
                if (letterHashMap[char] != null) {
                    var count = letterHashMap[char]
                    if (count != null) count += 1 else count = 1
                    letterHashMap[char] = count
                    continue
                }
        letterHashMap[char] = 1
    }

    var countOfRequiredCharacters = 0
    if (letterHashMap.isNotEmpty())
        for (letterMap in letterHashMap)
            if (letterMap.value % 2 == 0) continue else ++countOfRequiredCharacters

    return countOfRequiredCharacters
}