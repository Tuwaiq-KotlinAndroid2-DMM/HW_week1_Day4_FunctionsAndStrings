fun main() {
    println("Enter a Word :")
    var w= readLine()
    palindrome(w.toString())
}

fun palindrome(text:String){

    if(text==text.reversed())
        println("$text is a palindrome string")
    else
        println("$text is not a palindrome string")
}