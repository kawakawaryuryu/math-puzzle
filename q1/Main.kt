fun main(args: Array<String>) {
    for (num in 11..100000 step 2) {
        if (isPalindrome(toDecimalList(num)) && isPalindrome(toBinaryList(num)) && isPalindrome(toOctalList(num))) {
            println(num)
            break
        }
    }
}

fun toDecimalList(decimalNum: Int): MutableList<Int> {
    val decimalList = mutableListOf<Int>()
    var ans = decimalNum
    decimalList.add(0, ans % 10)
    while (ans / 10 != 0) {
        ans /= 10
        decimalList.add(0, ans % 10)
    }
    return decimalList
}

fun toBinaryList(decimalNum: Int): MutableList<Int> {
    val binaryList = mutableListOf<Int>()
    var ans = decimalNum
    binaryList.add(0, ans % 2)
    while (ans / 2 != 0) {
        ans /= 2
        binaryList.add(0, ans % 2)
    }
    return binaryList
}

fun toOctalList(decimalNum: Int): MutableList<Int> {
    val octalList = mutableListOf<Int>()
    var ans = decimalNum
    octalList.add(0, ans % 8)
    while (ans / 8 != 0) {
        ans /= 8
        octalList.add(0, ans % 8)
    }
    return octalList
}

/**
 * 回文かどうか
 */
fun isPalindrome(num: MutableList<Int>): Boolean {
    for (first in 0..(num.size / 2 - 1)) {
        val last = num.size - 1 - first
        if (num[first] != num[last]) return false
    }
    return true
}
