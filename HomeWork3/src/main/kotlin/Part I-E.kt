fun main(){
  println(FirstlastCharRemoved("Have a nice day"))
}
fun FirstlastCharRemoved (text: String): String{
    var FChar_LChar= text.drop(1).dropLast(1)
    return FChar_LChar

}