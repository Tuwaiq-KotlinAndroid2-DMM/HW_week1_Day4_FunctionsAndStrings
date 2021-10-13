fun main() {
    println()
    println()
    println()
    /*  var name="Emtnan ahmed "
   name=   name.toUpperCase()
      println(name)
      for (c in name){
          println(c)}
    var sub=  name.substring(2,5)
    var index=  name.indexOf("emtenan")
      println(sub)*/

}

    fun getDomain(email: String): String {
        // var email= readLine()
        // for (c in email){
        var index1 = email.indexOf("@")
        var index2 = email.indexOf(".")
        var sub = email.substring(index1, index2)

    }

}
