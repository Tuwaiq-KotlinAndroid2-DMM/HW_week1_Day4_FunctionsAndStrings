fun main() {
    print("Number of  Vowels in the string:" )
    println(vowCount("supermarket"))
}
fun vowCount(text:String) :String {
    var Vowchar = 0
    for (x in text.indices) {
        when (text[x]) {
            'i', 'o', 'u', 'e', 'a' ->   Vowchar++ }}
                return Vowchar.toString()



    }






