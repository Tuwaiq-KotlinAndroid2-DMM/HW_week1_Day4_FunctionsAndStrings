import org.w3c.dom.Text

fun main() {

    var x = removeSpace("hello dnh jumanah   kotlin")
    println(x)
}

fun removeSpace(text: String):String{
    var result = text

    result = result.replace("\\s".toRegex(), "")
return result

}