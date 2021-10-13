fun isEven (x:Int): Boolean{

    var result = false

    if (x%2==0){
        result = true
    }
    return result
}
fun main() {
    println(isEven(2))
}
