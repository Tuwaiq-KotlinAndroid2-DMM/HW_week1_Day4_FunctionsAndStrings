fun main() {

    println("Enter Word to count vowels:")
    var w= readLine()
    println("Number of  Vowels in the string:" +vowels( w.toString()))
}

fun vowels(text:String):Int{
    var v = 0
    for (w in text){
        if(w.toLowerCase()=='a'|| w.toLowerCase()=='u'||w.toLowerCase()=='e'||w.toLowerCase()=='i'||w.toLowerCase()=='o'){
            v++
    }

    }
    return v
}