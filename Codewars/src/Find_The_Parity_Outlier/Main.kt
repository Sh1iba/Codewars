package Find_The_Parity_Outlier

fun main() {
    println(find(arrayOf(2,6,8,-10,3)))
    println(find(arrayOf(206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781)))
}

fun find(integers: Array<Int>): Int {
    val arr1 = mutableListOf<Int>()
    val arr2 = mutableListOf<Int>()

    for (i in integers) {
        if (i % 2 == 0) {
            arr1.add(i)
        } else {
            arr2.add(i)
        }
    }

    if (arr1.size == 1) {
        return  arr1[0]
    } else {
        return  arr2[0]
    }
}
