package fundamentals


fun main() {
    println(maps(intArrayOf(1, 2, 3)))

}

fun maps(x: IntArray): IntArray {
    val z = IntArray(x.size)
    for(i in x.indices){
        z[i] = x[i]*2
    }
    return z
}