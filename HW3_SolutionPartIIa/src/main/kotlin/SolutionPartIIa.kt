fun main(){
    println(isPalindrome("radar"))
}
fun isPalindrome(str: String):Boolean {
    if(str == str.reversed()) return true
    return false

}