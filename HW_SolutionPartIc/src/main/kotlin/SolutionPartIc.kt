fun main(){
    println(isEven(2))
}
fun isEven(n: Int): Boolean {
    var res = false
    if (n % 2 == 0) {
        res = true
    }
    return res
}