
fun main() {
    print("the middle character in the string: ")
    print(mdChar( "ali")) }


   fun mdChar (text:String)  {
       var len = text.length
       if (len % 2 ==1) {
           var middle = len/2
           var gitmiddle = text.get(middle)
           println(gitmiddle)




    }

}


