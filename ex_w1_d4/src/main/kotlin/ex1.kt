fun main() {
    var age= arrayOf(22,33,11,1)

 /*var  sum= age.minOrNull()
    var x=age.maxOrNull()
  var y=  age.clone()
   var a= age.reversedArray()*/
    // أطبع من الكبير للصغير
    age.sort()//من الصغير للكبير
    println(age.contentToString())
age.reverse()//اعكس المصفوف
    println(age.contentToString())

}