
fun main() {
    //a. Write a function to display the middle character of a string.

    println(mdChar("mashael"))
    //b. Write a function to count all vowels in a string.

    println(coVowels("mashael alotaibi"))
    //c. Write a function named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.

    println(isEven(84))
   //d. Write a function named removeSpace() which removes spaces from a string

    println(removeSpace("mashael alotaibi"))
    //e. Write a function returns a new string with first and last character removed

    println(removeFirstLast("mashael"))
}
fun mdChar (middle:String): Char {
    var MC = middle.elementAt(middle.length/2)
    return MC
}

fun coVowels (vowels: String):Int{

    var vow= arrayOf('u','o','e','a','i')
    var counter=0
    for(v in vowels){
        if(vow.contains(v)){
            counter++
        }
    }
    return counter

}
fun isEven(num: Int): Boolean {
    var e = false
    if (num % 2 == 0) {
        e = true
    }
    return e
}

fun removeSpace(text: String): String {

    var text=text.replace(" ","")
    return text
}

fun removeFirstLast (FirstLast: String):String{
    var FLR =FirstLast.substring(1,FirstLast.length-1)
    return FLR
}