fun main() {
   // println(vowCount("supermarket"))
    println("Number of  Vowels in the string: " + vowCount("supermarket"))

}
fun vowCount(string: String) : Int
{
    var count = 0
    var vowels = arrayOf('a','o','u','i','e')
    // var vowel = v.contains(vowels)
    for (v in string)
   {
           if (vowels.contains(v)) {
               count++
           }
    }
    return count
    }




