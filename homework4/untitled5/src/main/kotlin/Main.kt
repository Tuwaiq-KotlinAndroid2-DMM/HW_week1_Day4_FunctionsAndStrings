fun main() {
   println(mdchar("Ali"))
    println(vowCount("ali"))
    println(isEven(9))

}
fun mdchar(x: String): Char {
     val m= x.length/2
    return x[m]
}
fun vowCount(x: String): Int {
    var c=0
    for (i in 0..x.length-1){
        if (x[i] == 'a' || x[i] =='e' || x[i] =='u' || x[i] =='i' || x[i] =='o')
            c++
    }
    return c
}

fun isEven(x: Int): String{
    var a="null"
    if(x%2 == 0)
        a="Yes"
    else
        a="No"
    return a
}





