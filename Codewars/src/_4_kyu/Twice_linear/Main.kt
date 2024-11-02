package _4_kyu.Twice_linear


fun main(){
    println( dblLinear(30))
}

fun dblLinear(n:Int):Int {
    var u = mutableListOf(1)
    var i = 0
    var j = 0
    while (u.size <= n) {
        var y = 2 * u.get(i) + 1
        var z = 3 * u.get(j) + 1
        if (y < z) {
            u.add(y)
            println(u)
            i++
        } else if (y > z) {
            u.add(z)
            println(u)
            j++
        } else {
            u.add(y)
            i++
            j++
        }
    }
    u.sort()
    println(u)
    return u.get(n)
}