
fun va() {
    var text = "supermarket"

    text.forEach { c ->
        when (c) {
            'a', 'e', 'i', 'o', 'u' -> println("$c is a vowel")
        }

    }

}

