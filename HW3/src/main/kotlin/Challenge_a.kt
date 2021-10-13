fun main() {
    // Check if a word is Palindrome
    println("Enter a word to check if it is Palindrome: ")
    var text = readLine().toString()

    var p = isPalindrome(text)
    println(p)


}

fun isPalindrome(text:String):Boolean{
    var result = false

    var t = text.reversed()
    if (text==t){
        result = true
    }else{
        result = false
    }

    return result
}