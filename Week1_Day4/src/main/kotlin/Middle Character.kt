fun main( ) {
    println("Enter Word to find middle character:")
    var w= readLine()
    middle_character(w.toString())
}
fun middle_character(text:String){
    var c=" "
    var l= (text.length)/2
    c= text.get(l).toString()
    println("The middle character in the string:"+c)
}