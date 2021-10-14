fun main (){

    println(mchar("Esraa"))

}

fun mchar(character:String){

    var length = character.length
    if (length%2==1){

        var m = length/2
        var getmid = character.get(m)
        println("The middle character in string: $getmid")
    }

}


/*
    var l = character.length /2
    var middle = l
    println("The middle character in string: + $middle")

 */