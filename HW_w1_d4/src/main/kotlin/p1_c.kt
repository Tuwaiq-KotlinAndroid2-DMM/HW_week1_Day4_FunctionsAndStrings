fun main() {
println(isEven(2))
}

fun isEven(x: Int): Boolean {
    var result: Boolean=true


    if (x % 2 == 0) {
 result=true
    } else {
result=false
    }
return result
}