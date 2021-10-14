fun main() {
     var name="Nora Ahmed Almusbeh"
    var n=  removeSpace(name)
    println(n)
}


fun removeSpace(text:String):String{

   var newText= text.replace(" ","")

return newText
}