fun main() {
    println("Enter a Word :")
    var w= readLine()
    println(remove(w.toString()))
}

fun remove(text:String):String{

   var t=text.removeRange(0,1)
   return t.removeRange(t.length-1,t.length)

}