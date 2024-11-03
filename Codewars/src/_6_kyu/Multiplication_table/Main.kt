package _6_kyu.Multiplication_table

fun main() {
    println(multiplicationTable(3))
}

fun multiplicationTable(size: Int): Array<IntArray> {
    var arr = Array(size) {IntArray(size)}

    for(i in 0..<size) {
        for (j in 0..<size) {
            arr[i][j] = (j + 1) * (i + 1)
        }
    }

    return arr
}