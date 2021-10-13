fun main() {
    println(removes_spaces("John Doe"))
}
fun removes_spaces (text :String):String{
    var newVal = text.replace(" ","")
    return newVal
}
