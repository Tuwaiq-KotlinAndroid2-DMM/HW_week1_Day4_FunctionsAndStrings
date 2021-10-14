fun main(){
    println(checkPass("abcd1234"))
}
fun checkPass(pass: String): Boolean {
    var v = false
    var d = 0
    if (pass.length < 10) {
        v = false
    }
    for(t in pass){
        if(!t.isLetterOrDigit())
            v=false
        if(t.isDigit()){
            d++
            if(d<2)
                v=false
        }
    }
    return v
}