fun main() {
    // a string with first and last character removed
    println("Enter a sentence: ")
    var r = readLine().toString()
    var a = r.substring(1,r.length-1)
    println("New sentence is: $a")
}