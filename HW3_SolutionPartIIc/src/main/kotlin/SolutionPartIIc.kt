import java.math.RoundingMode
import java.text.DecimalFormat
fun main(){
    println(roundOff(34.5458738))
}

fun roundOff(num: Double):Double {
    var rf = DecimalFormat("#.##")
    rf.roundingMode = RoundingMode.FLOOR
    return rf.format(num).toDouble()

}