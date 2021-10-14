fun main() {

    var x = drop("Esra")
    println(x)

}

fun drop(text:String):String{

    var result = text

    result =result.drop(1).dropLast(1)
    return result
}