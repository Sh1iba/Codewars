package _6_kyu


fun main() {
    println(spinWords("Yes, retfa gnivlos this melborp, I will hctaw ratava dnegel of AAng"))

}


fun spinWords(sentence: String): String {
    var temp : String = ""
    var strMoreFive : String = ""
        for(i in sentence){
            if(i != ' '){
                temp+=i
            }
            else{
                if(temp.length >=5){
                    strMoreFive += temp.reversed()
                }else{
                    strMoreFive+=temp
                }
                strMoreFive+=" "
                temp=""
            }

        }
    strMoreFive += if (temp.length >= 5) {
        temp.reversed()
    } else {
        temp
    }

return strMoreFive
}