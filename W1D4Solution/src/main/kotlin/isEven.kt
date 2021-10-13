fun main() {
    print("Enter a number: ")
    var number = Integer.valueOf(readLine())
    println(isEven(number))
}

fun isEven(num:Int):Boolean{
    if (num%2==0)
        return true
    else
        return false
}