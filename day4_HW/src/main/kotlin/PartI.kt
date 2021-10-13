fun main() {
    //a.
    println("\nEnter any name to get the middle character:")
    var name = "ali" //readLine()
    println("The middle character in the string: ${name?.let { mdChar(it) }}")
    //b.
    println("\n\nEnter any word to get the number of vowels it contains:")
    var wordWithVowels = "supermarket"//readLine()
    println("Number of vowels in the string: ${wordWithVowels?.let { vowCount(it) }}")
    //c.
    println("\n\nEnter any number to check if it is even:")
    var isNumberEven = 2//Integer.valueOf(readLine())
    println("the number $isNumberEven even? ${isEven(isNumberEven)}")
    //d.
    println("\n\nEnter any text to remove any spaces:")
    var textToRemoveString = "John Doe"//readLine()
    println("the text without spaces: ${removeSpaces(textToRemoveString)}")
    //e.
    println("\n\nEnter any text to remove the first and last character:")
    var textToRemoveFirstLast = "John Doe"//readLine()
    println("the text without first and last character: ${removeFirstLastChar(textToRemoveFirstLast)}")
}

//a. Write a function to display the middle character of a string.
fun mdChar(text: String): Char{
    var middleIndex = (text.length/2).toInt()
    var result = text.get(middleIndex)
    return result
}
//b. Write a function to count all vowels in a string.
fun vowCount(text: String): Int{
    var vowelCounter = 0
    var vowels = arrayOf('a','o','e','u','i')
    for (char in text){
        if (vowels.contains(char)){
            vowelCounter++
        }
    }
    return vowelCounter
}
//c. Write a function named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.
fun isEven(number: Int): Boolean{
    var result = false
    if (number%2 ==0) result = true
    return result
}
//d. Write a function named removeSpace() which removes spaces from a string
fun removeSpaces(text: String): String{
    var result = text.replace(" ","")
    return result
}
//e. Write a function returns a new string with first and last character removed
fun removeFirstLastChar(text: String): String{
    var result = text.dropLast(1).drop(1)
    return result
}