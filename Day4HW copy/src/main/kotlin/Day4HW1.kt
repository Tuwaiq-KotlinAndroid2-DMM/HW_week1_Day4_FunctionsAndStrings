
fun main() {
         var name ="Nora"

  var midd =  mdChar(name)
    println("The middle character in the name:$midd")

}

fun mdChar(text:String) :Char{

    var stringLength = text.length

    var middle = stringLength / 2

    var c = text.get(middle)



    return c
}