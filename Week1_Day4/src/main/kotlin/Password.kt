fun main() {
    println("Enter a Word :")
    var w= readLine()
    println(checkPass(w.toString()))
}
fun checkPass(pass:String): String {
    var result=""
    var counter=0
    if(pass.length>=10){
        for(char in pass){
            if(char !in 'A'.. 'Z' && char !in 'a'..'z' && char !in '0'..'9'){
                result="Invalid Password"
                break
            }else{
                if(char in '0'..'9'){
                    counter++
                    if(counter >=2){
                        result="valid password: $pass"
                    }else{
                        result="Invalid password has <2 digits"
                    }
                }
            }
        }
    }else
        result="Invalid password! has < 10 character "
    return result
}