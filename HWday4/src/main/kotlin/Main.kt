import kotlin.math.roundToLong

fun main() {

    println(midChar("Ali"))
    println(numOfVow("Tuaiq"))
    println(isEven(8))
    println(removeSpace("H e l l o"))
    println(trimFirstLast("MMohammedd"))
    println(isPalindrome("hih"))
//    println(checkPass("re44jfjfkjkfjkf"))
//    println(roundtohund(5.123456789))
}

// a. middle Char

fun midChar(text: String): String {
    var indexMid = text.length
    if (indexMid % 2 == 0) indexMid /= 2
    if (indexMid % 2 != 0) indexMid = (indexMid - 1) / 2
    return "the middle char of $text is ${text[indexMid]}"
}

//b. Write a function to count all vowels in a string.

fun numOfVow(text: String): Int {
    var vowels = 0
    for (v in text) {

        when (v) {
            'o', 'a', 'e', 'i', 'u' -> vowels++
        }
    }
    return vowels
}

// c. Write a function named isEven that accepts an int argument.
// The method should return true if the argument is even, or false otherwise.

fun isEven(num: Int): Boolean {
    if (num % 2 == 0) return true

    return false
}

//d. Write a function named removeSpace() which removes spaces from a string

fun removeSpace(str: String): String {

    return str.replace(" ", "")
}

//e. Write a function returns a new string with first and last character removed

fun trimFirstLast(str: String): String {

    return str.subSequence(1 .. str.length-2).toString()
}

//optional challenges
//a. Write a method that takes as input a string and returns true if the string is a palindrome;

fun isPalindrome (str: String): Boolean {
    if (str == str.reversed()) return true
    return false
}

//b. Write a function to check whether a string is a valid password.
//Password rules:
// A password must have at least ten characters.
// A password consists of only letters and digits.
// A password must contain at least two digits.

/*

I'll try doing the rest in the morning before class.

fun checkPass (password: String): Boolean {
    var valid = false
    var dig = 0
    if (password.length < 10) valid = false
    for (l in password){
       if (!l.isLetterOrDigit()) valid = false
        if (l.isDigit()) {
            dig++
            if (dig < 2) valid = false

        }
    }

    return valid
}

//c. Write a function named roundOff() which returns formated rounded float #.##


//

fun roundtohund (num: Double): Float {

}


 */