fun countVowels(str : String):Int {
    var line=""
    var vowels :Int = 0
    line  =str.toLowerCase()
    for (i in 0..line.length - 1) {
        val ch = line[i]
        if (ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u') {
            ++vowels
        }
    }

    return vowels
}



fun main() {
    println("Number of vowles in the string is "+countVowels("aieo"))
}