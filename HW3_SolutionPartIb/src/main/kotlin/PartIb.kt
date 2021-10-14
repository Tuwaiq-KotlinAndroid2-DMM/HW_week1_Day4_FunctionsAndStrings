fun main() {
    println("Number of vowels in the string is: " + vowCount("supermarket"))
}
fun vowCount(string: String): Int{
    var c=0
    var vow= arrayOf('u','o','e','a','i')
    for(v in vow){
        if(vow.contains(v)){
            c++
        }
    }
    return c
}
