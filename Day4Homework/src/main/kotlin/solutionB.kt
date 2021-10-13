fun main() {


    var v = FindVowel("jumanah")
    println(v)
}

fun FindVowel(text:String){
    var vowel = text
    for (x in vowel){
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
            println("$x is a vowel")
    }

}

