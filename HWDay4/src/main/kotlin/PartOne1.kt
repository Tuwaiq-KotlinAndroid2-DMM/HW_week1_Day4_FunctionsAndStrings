fun main() {
    println("The middle character in the string: " + mdChar("Njahmn"))

}
fun mdChar(word : String) : Char
{
    //var letter = word.indexOf(word.length %2)
   var middleChar = word.elementAt(word.length/2)
    // var    (word.length) % 2
  // var subWord = word.substring(1,2)
   // println("The middle character in the string: " + subWord)
   return middleChar
    //println( + middleChar)

}

