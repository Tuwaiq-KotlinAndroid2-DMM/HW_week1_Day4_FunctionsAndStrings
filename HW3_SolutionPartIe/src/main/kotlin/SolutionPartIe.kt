fun main(){
    println(remove("Dalia"))
}
fun remove (string: String):String{
    var sn =string.substring(1,string.length-1)
    return sn
}