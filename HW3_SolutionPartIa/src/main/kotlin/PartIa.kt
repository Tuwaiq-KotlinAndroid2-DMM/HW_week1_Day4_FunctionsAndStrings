fun main() {
    println("The middle character in the string: "+mChar("ali"))
}
fun mChar(t:String):Char{
    var mc = t.elementAt(t.length/2)
    return mc
}