fun main() {
      println("Please enter the number")
    var num = Integer.valueOf(readLine())
    var x= isEven(num)
    println(x)
}

fun isEven(number:Int):Boolean{
    var x=false
    if (number % 2 == 0) {
           x=true
        return x;
    }else
    return x
}