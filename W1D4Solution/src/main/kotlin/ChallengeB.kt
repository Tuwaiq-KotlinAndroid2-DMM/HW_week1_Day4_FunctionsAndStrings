fun main() {
    print("Enter your password: ")
    var password = readLine()
    println(checkPassword(password.toString()))
}

fun checkPassword(pass: String): String {
    var result = ""
    var digitCounter = 0

    if (pass.length >= 10) {
        for (character in pass) {
            if (character !in 'A'..'Z' && character !in 'a'..'z' && character !in '0'..'9') {
                result = "Invalid password! contains symbols"
                break
            } else {
                if (character in '0'..'9') {
                    digitCounter++
                    if (digitCounter >= 2) {
                        result = "Valid password: $pass"
                    } else {
                        result = "Invalid password! has < 2 digits"
                    }
                }

            }

        }
    } else
        result = "Invalid password! has < 10 characters"

    return result

}