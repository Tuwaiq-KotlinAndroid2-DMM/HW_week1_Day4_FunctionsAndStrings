fun mdChar(str :String):Char{
    val len=str.length
    val index : Int= len/2
    return str[index]
}

fun main() {
    println(mdChar("ali"))
}