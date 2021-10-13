fun main() {
    // Removing spaces
    println("Enter a sentence: ")
    var space = readLine().toString()
    var nospace = space.replace(" ", "")
    println(nospace)
}