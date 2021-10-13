fun removeSpace(string: String?): String?   {
    var str = string?.replace(" ","")


    return str
}
fun main () {
    println (removeSpace("John Doe") )
}

