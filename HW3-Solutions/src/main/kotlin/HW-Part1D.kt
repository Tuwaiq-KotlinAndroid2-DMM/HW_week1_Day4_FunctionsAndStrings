fun main() {

    println(RemoveSpace("Esra Alali"))

}


fun RemoveSpace (text :String):String{

    var result =text
    result= result.replace(" ","")
    return result
}

