fun countVowels(s: String): Int {
    var vowels = arrayOf("a", "o", "u", "e", "i")
    var count = 0
    for (i in vowels) {
        if (vowels.indexOf(i) != -1) {
            count++
        }
    }
    return count
}
fun main(){
  print("jdskcvbjksdbvjks")
}
