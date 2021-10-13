fun main() {
    print("Enter a text: ")
    var text = readLine()
    println("Text without the first and the last characters: " + removeFirstLast(text.toString()))
}

fun removeFirstLast(text:String):String{
    var newText = text.drop(1)
    newText = newText.dropLast(1)
    return newText
}