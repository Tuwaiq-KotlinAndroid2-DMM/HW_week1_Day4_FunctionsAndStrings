fun main() {


}
fun removeSpace(string: String?): String?   {
    var str = string?.replace(" ","")


    return str
}



fun isEven (x:Int): Boolean{

    var result = false

        if (x%2==0){
            result = true
    }
    return result
}

fun voweles() {
    var text = "Hello world"

    text.forEach{c ->
        when(c) {
            'a', 'e', 'i', 'o', 'u' -> println("$c is a vowel")
        }
    }
}



fun mdChar (x:String)  {
var l= x.length
    var middle = (l / 2)
    println (middle)

}







fun removeFirstandLast(str: String): String {var str = str
    str = str.substring(1, str.length - 1)

    return str
}
