fun main() {
        println(isEven(2))
}
fun isEven (num: Int): Boolean {
        var result = false

                if (num % 2 == 0)
                        result = true

        return result
}