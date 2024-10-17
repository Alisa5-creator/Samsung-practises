import kotlin.math.*
fun main() {
    var s = readln.split(" ")
    var k = s[0].toInt
    var x = s[1].toInt
    var y = s[2].toInt
    if (abs(k - min(x, y)) < 2 ) {
        println(min(x, y) + 2 - max(x, y))
    }
    else {
        println(k - max(x, y))
    }
}
