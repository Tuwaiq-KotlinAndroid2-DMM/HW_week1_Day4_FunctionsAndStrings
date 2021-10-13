fun main() {
    println(mdChar("Ali"))
    println(vowCount("Supermarket"))
    println(isEven(2))
    println(removeSpace("John Doe"))
}

fun mdChar(char:String):Char{
    return char.elementAt(char.length / 2 )
}
fun vowCount(words:String): String {
    var counter = 0
    for (c in words.indices) {
        when (words[c]) {
            'a', 'o', 'u', 'e', 'i' -> counter++
        }
    }
        return "Number of Vowels in the string : $counter"
    }


fun isEven(num:Int):Boolean {
    var x =false
    if (num % 2 ==0) {
        x =true
    }
    return x
}

fun removeSpace(name:String):String {
    var name =name.replace(" "," ")
    return name
}