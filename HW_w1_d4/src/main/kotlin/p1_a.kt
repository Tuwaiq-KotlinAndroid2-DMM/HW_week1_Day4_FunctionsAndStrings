fun main() {


    val x = mdchar("ali")
   println("The middle character in the string: "+x)
}

    fun mdchar(x: String): Char {

        var mIndex = (x.length / 2)
        var display = x.get(mIndex)
        return display
    }
