import java.math.RoundingMode

fun main() {
	println(middleCharacter("Tuwaiq"))
	println("Number of vowels in the string: ${vowelsCount("supermarket")}")
	println(isEven(2))
	println(removeSpaces("John Doe"))
	println(removeFirstAndLast("Hello world"))
	println(isPalindrome("radar"))
	println(roundOff(3.14123123))
}

// Part A
fun middleCharacter(string: String) = string.elementAt(string.length / 2)

// Part B
fun vowelsCount(string: String): Int {
	val vowels = arrayOf('a', 'i', 'e', 'o', 'u')
	var count = 0
	for (char in string) {
		if (vowels.contains(char)) {
			count ++
		}
	}

	return count
}

// Part C
fun isEven(number: Int) = number % 2 == 0

// Part D
fun removeSpaces(string: String) = string.replace(" ", "")

// Part E
fun removeFirstAndLast(string: String) = string.substring(1, string.length - 1)


// Optional A
fun isPalindrome(string: String) = string == string.reversed()

// Optional C
fun roundOff(number: Double) = number.toBigDecimal().setScale(2, RoundingMode.DOWN).toDouble()