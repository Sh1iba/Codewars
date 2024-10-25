package Maximum_Multiple

fun main() {
    println(maxMultiple(2, 7)) //6
    println(maxMultiple(7, 17)) //14
    println(maxMultiple(37, 200))//185
    println(maxMultiple(7, 100))//98
}

fun maxMultiple(d: Int, b: Int): Int {
    var N : Int = d

    if( N % 2 == 0){
       while(N+2 < b && N % d ==0 ){
           N+=2
       }
    }
    if (N % 2 != 0) {
        while(N+2 < b && N % d ==0){
            N+=2
        }
    }
    return  N
}


