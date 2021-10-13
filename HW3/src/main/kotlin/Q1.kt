fun main() {
    println("Enter a string: ")
    var text = readLine().toString()
    var m = middleCh(text)
    println("The middle letter is $m")
}

fun middleCh(text:String): String{

    var t = text.length/2
    var m = text[t].toString()
    return m
}