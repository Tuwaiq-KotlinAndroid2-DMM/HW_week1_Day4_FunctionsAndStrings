# HW_week1_Day4_FunctionsAndStrings
  
> Note: You must save your solution as `solution_part1.kt` for Part I, and `solution_part2.kt` for Part II to be submitted before 9AM. ⚠️

# Instructions 📋
---

## Part I - Practice with functions and strings.
---
#### a. Write a function to display the middle character of a string.
```sh
fun main() {
   println(mdChar("ali"))
}
```
Output: 
```
The middle character in the string: 5
```
### b. Write a function to count all vowels in a string.
```sh
fun main() {
   println(vowCount("supermarket"))
}
```

Output:
```
Number of  Vowels in the string: 4
```


#### c. Write a function named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.
```sh
fun main() {
    println(isEven(2))
}
```

Output:
```
true
```


#### d. Write a function named removeSpace() which removes spaces from a string
```sh
fun main() {
    println("John Doe)
}
```

Output:
```
JohnDoe
```

#### e. Write a function returns a new string with first and last character removed

## Part III - Challenges (Optional).
---
#### a. Write a method that takes as input a string and returns true if the string is a palindrome;
```sh
    isPalindrome("radar")
```
    
    
Output: 
```
    "radar" is a palindrome string.
```

### b. Write a function to check whether a string is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.

```sh
    validate("abcd1234")
```
    
Output: 
```
    Password is valid: abcd1234 
```

### c. Write a function named roundOff() which returns formated rounded float #.##
```sh
    roundOff(34.5458738f)
```
    
Output: 
```
    34.50
```


# Learning Resources  📚
* [Functions in Kotlin](https://kotlinlang.org/docs/functions.html#parametersl)
* [Strings in Kotlin](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/)
