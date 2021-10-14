fun main(){
println( isPalindrome("radar"))
}
fun   isPalindrome(text:String):String{
    var ntext =text.reversed()
    var result="re"
    if (text==ntext){
    result=text
    println(result+"  is Palindrome")}
    else{
        println(result+" no Palindrome :")}
    return result
}