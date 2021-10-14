fun main(){
    println("The midle character in the string:" + mchar("ali"))
    println("Number of vowels in the string is "+vowCount("supermarket"))
    println	(isEven(2))
    println(remove("tulip"))
    println(Rs("pearl sea"))



}
    fun mchar (t:String): Char {
        var mc =t.elementAt(t.length/2)
        return mc
}



//................................................

fun vowCount(string: String): Int {
    var c=0
    var vow= arrayOf('u','o','e','a','i')

    for (v in vow){
        if (vow.contains(v)){
            c++
        }
    }
    return c

}
//..........................................................

fun isEven(n: Int): Boolean{
    var res = false
    if (n % 2==0) {
        res = true
    }
    return res
}

fun Rs(text :String):String{

    var text ="pearl sea"
    text= text.replace(" ","")
    return text

}

fun remove(sn: String) :String{
    var sn =sn.substring(1,sn.length-1)

    return sn
}