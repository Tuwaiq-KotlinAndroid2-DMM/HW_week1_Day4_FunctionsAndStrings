fun main() {

    println("Enter a number:")
    var w= Integer.valueOf(readLine())
    println(isEven(w))
}

fun isEven(a:Int):Boolean{
    var result= false
    if(a%2==0 )
        result = true
    return result

}