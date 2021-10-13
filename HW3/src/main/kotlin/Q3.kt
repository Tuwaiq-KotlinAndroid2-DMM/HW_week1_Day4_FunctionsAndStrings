fun main() {
    println("Check if the entered number is even: ")
    var n = Integer.valueOf(readLine())
    var even = isEven(n)
    println(even)
}

fun isEven(n:Int): Boolean{
    var result = false
    var n = n%2
    if (n%2==0){
        result=true
    }else{
        result=false
    }

    return result
}