fun main() {
    println("Enter a text to count its vowels: ")
    var text = readLine()
    println("Number of vowels in the text: " + countVowels(text.toString()))
}

fun countVowels(text:String):Int{
    var counter = 0
    for (letter in text) {
        //if (text.contains("a") || text.contains("e") || text.contains("i") || text.contains("o") || text.contains("u"))
        if (letter.toLowerCase() == 'a' || letter.toLowerCase() == 'e' || letter.toLowerCase() == 'i' || letter.toLowerCase() == 'o' || letter.toLowerCase() == 'u' )
        counter++
    }
    return counter
}