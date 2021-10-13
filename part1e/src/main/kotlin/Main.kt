fun dropFirstLast(str :String):String{

    val newstr=str.drop(1)
    val newstr2=newstr.dropLast(1)
    return newstr2
}

fun main() {
    println("the string after removing first and last char is  "+dropFirstLast("hello world"))
}