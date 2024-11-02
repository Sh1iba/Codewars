package _7_kyu.Maximum_Multiple

fun main() {
    println(maxMultiple(2, 7)) //6
    println(maxMultiple(7, 17)) //14
    println(maxMultiple(37, 200))//185
    println(maxMultiple(7, 100))//98
}

fun maxMultiple(d: Int, b: Int): Int {
    var N : Int = 0
    for (i in b downTo 1){
        if(i % d == 0){
            N = i
            break
        }
    }
   return N
}


