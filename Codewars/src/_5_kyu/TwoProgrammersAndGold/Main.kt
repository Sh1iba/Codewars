package _5_kyu.TwoProgrammersAndGold

fun main() {
    println(distributionOf(intArrayOf(10,1000,2)))

}

fun distributionOf(g: IntArray): Pair<Int,Int> {
    val arr = arrayOf(0,0)
    var flag = true
    val arr2 = g.toMutableList()
    val res: Pair<Int, Int>
    while(arr2.isNotEmpty()){
        if(arr2.first() > arr2.last() && flag){
            arr[0] += arr2.first()
            arr2.removeAt(0)
            flag = false
        }else if (arr2.first() < arr2.last() && flag){
            arr[0] += arr2.last()
            arr2.removeAt(arr2.lastIndex)
            flag = false
        }else if (arr2.first() == arr2.last() && flag){
            arr[0] += arr2.first()
            arr2.removeAt(0)
            flag = false
        }
        else if (arr2.size == 1){
            arr[0] += arr2.first()
            arr2.removeAt(0)
            flag = false
        }
         else if (arr2.first() > arr2.last() && !flag){
            arr[1] += arr2.first()
            arr2.removeAt(0)
            flag = true
        }else if(arr2.first() < arr2.last() && !flag){
            arr[1] += arr2.last()
            arr2.removeAt(arr2.lastIndex)
            flag = true
        }else if (arr2.size == 1){
            arr[1] += arr2.first()
            arr2.removeAt(0)
            flag = true
        }
        else{
            arr[1] += arr2.first()
            arr2.removeAt(0)
            flag = true
        }
    }
    if(flag == true){
        res = Pair(arr[0],arr[1])
    }else{
        res = Pair(arr[1],arr[0])
    }
    return res
}




