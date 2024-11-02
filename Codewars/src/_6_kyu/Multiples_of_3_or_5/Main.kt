package _6_kyu.Multiples_of_3_or_5

fun main() {
    println(solution(10))
}

fun solution(number: Int) : Int {
    var res : Int = 0
    for(i in 1..number-1) {
        if( i % 3 == 0 || i % 5 ==0){
            res+=i
        }
    }

    return res
}