fun main() {
    print("Enter a word to find its middle character: ")
    var word = readLine()
    println("The middle character in the word: " + middleCharacter(word.toString()))
}

fun middleCharacter(word:String):Char{
    var length = word.length
    var midChar = word.get((length/2))
    return midChar
}