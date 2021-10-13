fun isEven(num : Int ): String{

    val evenOdd = if (num % 2 == 0) "even" else "odd"

    return evenOdd
}

fun main() {
    println(isEven(3))
}