package Highest_and_Lowest

import Find_The_Parity_Outlier.find

fun main() {
    println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4"))
    println(highAndLow("1 2 3"))
}

fun highAndLow(numbers: String): String {
    var high: Int = Int.MIN_VALUE
    var low: Int = Int.MAX_VALUE
    var temp: String = ""

    for (i in numbers) {
        if (i != ' ') {
            temp += i
        } else {
            if (temp.isNotEmpty()) {
                val num = temp.toInt()
                if (num > high) {
                    high = num
                }
                if (num < low) {
                    low = num
                }
                temp = ""
            }
        }
    }

    // Обработка последнего числа, если оно не пустое
    if (temp.isNotEmpty()) {
        val num = temp.toInt()
        if (num > high) {
            high = num
        }
        if (num < low) {
            low = num
        }
    }

    return "$high $low"
}
