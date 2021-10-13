fun main() {
    println(mdChar("ali"))
    println(vowCount("supermarket"))
    println(isEven(5))
    println(removeSpace("John Doe"))
}

//  a. Write a function to display the middle character of a string.
fun mdChar(char: String): Char {
    return char.elementAt(char.length / 2)
}

//  b.Write a function to count all vowels in a string.
fun vowCount(words: String): String {
    var counter = 0
    for (c in words.indices) {
        when (words[c]) {
            'a', 'e', 'i', 'o', 'u' -> counter++
        }

    }
    return "Number of  Vowels in the string: $counter"
}

//  c.Write a function named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.
fun isEven(num: Int): Boolean {
    var x = false
    if (num % 2 == 0) {
        x = true
    }
    return x
}

//  d.Write a function named removeSpace() which removes spaces from a string
fun removeSpace(name: String): String {
    var name = name.replace(" ", "")
    return name
}


