package Highest_Scoring_Word

fun main() {
    print(high("aa bb cc"))
}

fun high(str: String) : String {
// code here
    var maxpower : Int = 0
    var minpower : Int = 0
    var maxStr : String = ""
    var text : String = ""
    for (i in str){
        if(i != ' ') {
            minpower += calcPow(i.toString())
            text += i
            if(minpower > maxpower){
                maxpower = minpower
                maxStr = text
            }
        }
        else{
            text = ""
            minpower=0
        }
    }
    return maxStr
}

fun calcPow(s: String) : Int{
    var power : Int = 0
    val str : String = "abcdefghijklmnopqrstuvwxyz"
    for(i in str){
        power++
        if(s == i.toString()){
            return power
        }

    }
    return power
}