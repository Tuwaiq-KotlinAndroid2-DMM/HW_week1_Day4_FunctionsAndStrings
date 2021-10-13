fun main() {
    var vowel = charArrayOf('a','e','u', 'i', 'o')
    var text = "supermarket"
    text=text.toLowerCase()
    var result = vowels(text, vowel)
    println("There are $result vowels")

}

fun vowels(text:String, vowel:CharArray): Int{
    var count = 0
    for (i in text){
        if (i in vowel) {
            count++
        }
    }
    return count
}