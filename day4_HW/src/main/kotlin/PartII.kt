fun main() {
    //a.
    println("\nEnter any word to check if it is a palindrome:")
    var isNumberEven = "radar"//readLine()
    println(isNumberEven?.let { isPalindrome(it) })
    //b.
    println("\n\nEnter any word to check if it is a palindrome:")
    var password = "abcd1234"//readLine()
    println(password?.let { validate(it) })
    //c.
    println("\n\nEnter any number with decimal to round:")
    var numberRounding = "34.5458738f"//readLine()
    println(roundOff(numberRounding.toDouble()))
}

//a. Write a method that takes as input a string and returns true if the string is a palindrome;
fun isPalindrome(text:String): String{
    if(text.equals(text.reversed())){
        return "\"$text\" is a palindrome string."
    }else{
        return "\"$text\" is NOT a palindrome string."
    }
}
//b. Write a function to check whether a string is a valid password.
fun validate(password: String): String{
    //Password rules:
    //A password must have at least ten characters.
    //A password consists of only letters and digits.
    //A password must contain at least two digits.
    if (password.length >= 10 && password.matches("([A-Za-z0-9]*)(\\D*\\d){2,}".toRegex())){
        return "Password is valid: $password"
    }else{
        return return "Password is invalid: $password"
    }
}
//c. Write a function named roundOff() which returns formated rounded float #.##
fun roundOff(number: Double): String{
    return "%.2f".format(number)
}