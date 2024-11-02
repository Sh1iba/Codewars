@file:Suppress("UNUSED_CHANGED_VALUE")

package _4_kyu.Human_readable_duration_format


fun main() {
    println(formatDuration(86234462)) // Пример вызова
}

fun formatDuration(seconds: Int): String {
    var res = seconds
    var year = 0
    var day = 0
    var hour = 0
    var min = 0
    var sec = 0
    var str: String = ""
    var count = 0

    if (res == 0) return "now"

    year = res / 31536000
    res %= 31536000
    if (year != 0) count++

    day = res / 86400
    res %= 86400
    if (day != 0)  count++

    hour = res / 3600
    res %= 3600
    if (hour != 0) count++

    min = res / 60
    res%=60
    if (min != 0) count++

    sec = res
    if (sec != 0) count++

    /////////////////////////////////////////////
    if (year > 0) {
        if (year >= 2 && count > 2) str += "$year years, "
        else if (year >= 2 && count == 2) str += "$year years and "
        else if (year == 1 && count > 2) str += "$year year, "
        else if (year == 1 && count == 2) str += "$year year and "
        else if (year >= 2 && count < 2) str += "$year years"
        else str += "$year year"
    }

    if (day > 0) {
        if (day >= 2 && count > 2) str += "$day days, "
        else if (day >= 2 && count == 2) str += "$day days and "
        else if (day == 1 && count > 2) str += "$day day, "
        else if (day == 1 && count == 2) str += "$day day and "
        else if (day >= 2 && count < 2) str += "$day days"
        else str += "$day day"
    }

    if (hour > 0) {
        if (hour >= 2 && min!=0 && sec!=0) str += "$hour hours, "
        else if (hour == 1 && min!=0 && sec!=0) str += "$hour hour, "
        else if (hour >= 2 && min!=0 || sec!=0) str += "$hour hours and "
        else if (hour == 1 && min !=0) str += "$hour hour and "
        else if (hour >= 2 && count < 2) str += "$hour hours"
        else str += "$hour hour"
    }

    if (min > 0) {
        if (min >= 2 && sec != 0) str += "$min minutes and "
        else if (min == 1 && sec != 0) str += "$min minute and "
        else if (min >= 2) str += "$min minutes"
        else str += "$min minute"
    }

    if (sec > 0) {
        if (sec >= 2) str += "$sec seconds"
        else str += "$sec second"
    }

    return str
}


