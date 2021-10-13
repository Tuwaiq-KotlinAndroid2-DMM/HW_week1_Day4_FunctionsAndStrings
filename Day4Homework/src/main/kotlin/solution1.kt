fun main() {

    println(middleChar("jumanah"))


}

fun middleChar(text: String){

var length = text.length
    if(length%2==1){
        var m = length/2
        var gitmiddle = text.get(m)
        println(gitmiddle)
    }


}
