fun main() {

    var number = isEven(5)
    println(number)
}

fun isEven(num:Int):Boolean{
 var result =false
    var n =num
    if (n %2 == 0)
        result=true

    return result
}