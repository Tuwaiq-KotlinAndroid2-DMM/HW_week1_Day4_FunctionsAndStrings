fun main() {
    print("Enter a text: ")
    var text = readLine()
    println("The text without spaces: "+removeSpace(text.toString()))
}

fun removeSpace(text:String):String{
    var withoutSpace=text.replace(" ","")
    return withoutSpace
}