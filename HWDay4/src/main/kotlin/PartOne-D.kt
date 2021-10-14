fun main() {
    println(removeSpace("John Doe"))
}

fun removeSpace(string: String):String
{

    //string.replace()
    return string.replace(oldValue = " ",newValue = "")
}