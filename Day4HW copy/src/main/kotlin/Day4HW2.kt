fun main() {
     var text ="welcome"
    var x = vowCount(text)
    println("Number of  Vowels in the string: $x")
}


fun vowCount (text:String):Int{
          var count =0

           for (i in 0..text.length - 1)

                                       {
           var ch = text[i]
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        {
               count++

                        }
                                      }
   return count
}