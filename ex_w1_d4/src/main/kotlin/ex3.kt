import com.sun.jdi.IntegerValue

fun sum(a:Int, b:Int): Int {

    return a+b
}

fun mulit(a:Int,b:Int): Int {

 return   a*b
}

fun min(a:Int,b:Int): Int {

    return   a-b

}

fun main() {
    println("please enter tow number :")

    var a=Integer.valueOf(readLine())
    var b=Integer.valueOf(readLine())
    println(sum(a ,b))
    println(mulit(a,b))
    println(mulit(a,b))
}