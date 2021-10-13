fun removeSpace(str : String) :String{

    val newstr = str.replace("\\s".toRegex(), "")
    return newstr
}

fun main() {
    println(removeSpace("John Doe"))
}