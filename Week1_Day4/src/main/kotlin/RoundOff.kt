fun main() {
     println("Enter a number:")

     var w= readLine()
     if (w != null) {
          RoundOff(w.toFloat())
     }
}


fun  RoundOff(num: Float){
     val number3digits: Float = String.format("%.3f", num).toFloat()
     val number2digits: Float = String.format("%.2f", number3digits).toFloat()
     println(number2digits)
}
