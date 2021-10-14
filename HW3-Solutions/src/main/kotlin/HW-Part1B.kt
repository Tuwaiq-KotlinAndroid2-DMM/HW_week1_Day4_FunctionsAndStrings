fun main() {

  println("Number of  Vowels in the string: " + vowCount("Esra alali"))


}

fun vowCount (c:String) :Int {

    var count = 0
    for (element in c) {

        when (element) {
            'a', 'e', 'u', 'i', 'o' -> ++count
        }
    }
    return count
}