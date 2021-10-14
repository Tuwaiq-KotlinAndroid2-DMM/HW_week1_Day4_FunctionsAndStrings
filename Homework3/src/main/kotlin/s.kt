fun main() {

//        Part I - Practice with when

    println("Enter the number of the month:")
    var num = Integer.valueOf(readLine())
    var days = 29
    if (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) days = 31
    if (num == 4 || num == 6 || num == 9 || num == 11) days = 30
    when (num) {
        1 -> println("January has $days days")
        2 -> println("February has $days days")
        3 -> println("March has $days days")
        4 -> println("April has $days days")
        5 -> println("May has $days days")
        6 -> println("June has $days days")
        7 -> println("July has $days days")
        8 -> println("August has $days days")
        9 -> println("September has $days days")
        10 -> println("October has $days days")
        11 -> println("November has $days days")
        12 -> println("December has $days days")
    }
//        Part II - Practice with Loops and arrays

    println("Enter a positive number :")
    var mul = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var n = Integer.valueOf(readLine())
    if (n < 0)
        println("$n is a negative number.")
    else if (n > 0){
        for (i in mul){
            println("$n * $i = "+n*i)
        }
    }

// Write a program that prints how many elements that are odd numbers in array of integers

    var arr= arrayOf(12,32,4,5,6,7,4)
    var odds=0
    for (i in arr){

        if ( i % 2 != 0 )  odds++
    }
    println("There are $odds odds numbers in the array ")

}