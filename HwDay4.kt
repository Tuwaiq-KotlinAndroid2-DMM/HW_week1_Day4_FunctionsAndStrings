import java.math.RoundingMode
import java.text.DecimalFormat

fun main(){
    var MText = "Variables"
    var x = middleChar(MText)
    println(x)

    var line = "Supermarket"
    var printLine = vowels(line)
    println(printLine)

    var num = isEven(2)
    println(num)

    var text = removeSpace("Joe Mart")
    println(text)

    var newText = removeChar("Programming")
    println(newText)

    var palindrome = "radar"
    if (isPalindrome(palindrome)){
        println("$palindrome is a Palindrome")
    }else{
        println("$palindrome is not a Palindrome")
    }

    /*var VP = ("abcd1234")
    if(isValidPassword(VP)) {
        println("Password is valid: $VP")
    }else{
        println("Password is not valid: $VP")
    }*/

    var number = roundOff(31.5487)
    println(number)


}
//a. Write a function to display the middle character of a string.
fun middleChar(MText:String){
    //var words = MText.split(" ")
    var mid = MText.length
    if(mid %2 == 1){
        var position1 = mid / 2
        var middd1 = MText.get(position1)
        println(middd1)

    }else{
        var position2 = mid / 2 - 1
        var middd2 = MText.get(position2)
        println(middd2)
    }

}

//b. write a function to display all vowel in string
fun vowels(line:String){
    var counter = 0
    line.forEach { c ->
        when(c){
            'a' ,'e','i','u','o' ->counter++}
    }
    println("Number of vowel in the string: $counter")
}

//c. Write a function named isEven that accept an int argument. The method should return true if the arguement is even, or false otherwise
fun isEven(num: Int): Boolean
{
    var result = false
    if (num % 2 == 0 ){
        result = true
    }
    return result
}
//d. write a function named removeSpace whhich remove spaces from string
fun removeSpace(text: String): String{

    var text2 = text.replace(" ","")
    return text2

}

//e. Write a function returns a new string with first and last character removed
fun removeChar(newText: String): String{

    var firstInd = newText.substring(1,newText.length-1)
    return firstInd
}
//Part III - Challenges (Optional).
//a. Write a method that takes as input a string and returns true if the string is a palindrome

fun isPalindrome(TextPli: String): Boolean{
    var a = StringBuilder(TextPli)
    var reverseA = a.reverse().toString()
    return TextPli.equals(reverseA, ignoreCase = true)
}
//b. Write a function to check whether a string is a valid password.
/*fun isValidPassword(password: String): Boolean {
    var passwordRegex = password.toRegex("^" +
            "(?=.*[0-9])" +         //at least 1 digit
            "(?=.*[a-zA-Z])" +      //any letter
            "(?=\\S+$)" +           //no white spaces
            ".{10,}" +               //at least 8 characters
            "$");
    return passwordRegex.matcher(password).matches()
}*/

//c. Write a function named roundOff() which returns formated rounded float #.##

fun roundOff(number: Double): Double{
    var roundF = DecimalFormat("#.##")
    roundF.roundingMode = RoundingMode.FLOOR
    return roundF.format(number).toDouble()
}