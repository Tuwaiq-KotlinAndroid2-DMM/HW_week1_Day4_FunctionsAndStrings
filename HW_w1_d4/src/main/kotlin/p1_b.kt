fun main() {
val x=   vowCount("supermarket")
    println("Number of  Vowels in the string :"+x)
}
fun vowCount(text: String): Int {
var count=0
    for (x in text) {

        if (x == 'i' || x == 'e' || x == 'o' || x == 'u' || x == 'a')
     count++


    }
return count
}