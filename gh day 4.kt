 fun main(){
     var text = "ghzlan Aliiiiii albaiji"
     val x = wordNumber(text)
     println(x)
 }
   fun wordNumber(text:String):String{
       var words = text.split("")
       var result = ""
      for (W in words) {
          if (W.length>8) {
              result += W + ""

          }
      }
   return result
   }