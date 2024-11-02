package _5_kyu.RGB_To_Hex_Conversion

fun main() {
    println(rgb(148, 0, 211))

}

fun rgb(r: Int, g: Int, b: Int): String {
    val clamp = { value : Int -> value.coerceIn(0,255)}
    val hexString =  Integer.toHexString(clamp(r)).uppercase().padStart(2, '0')
    val hexString2 =  Integer.toHexString(clamp(g)).uppercase().padStart(2, '0')
    val hexString3 =  Integer.toHexString(clamp(b)).uppercase().padStart(2, '0')

    return "$hexString$hexString2$hexString3"
}

