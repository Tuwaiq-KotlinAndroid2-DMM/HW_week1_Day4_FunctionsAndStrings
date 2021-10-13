fun main() {
    println("Enter a Word :")
    var w= readLine()
    removeSpace(w.toString())
}

fun removeSpace(text:String) {


    println(text.replace(" ",""))

}