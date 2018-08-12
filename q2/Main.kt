fun main(args: Array<String>) {
    for (num in 1000..9999) {
        val str = num.toString()
        val a1 = str.substring(0, 1).toInt() *
                str.substring(1, 4).toInt()
        if (isReverse(str, a1.toString())) {
            println(str)
            continue
        }
        val a2 = str.substring(0, 2).toInt() *
                str.substring(2, 4).toInt()
        if (isReverse(str, a2.toString())) {
            println(str)
            continue
        }
        val a3 = str.substring(0, 3).toInt() *
                str.substring(3, 4).toInt()
        if (isReverse(str, a3.toString())) {
            println(str)
            continue
        }
        val a4 = str.substring(0, 1).toInt() *
                str.substring(1, 2).toInt() *
                str.substring(2, 4).toInt()
        if (isReverse(str, a4.toString())) {
            println(str)
            continue
        }
        val a5 = str.substring(0, 1).toInt() *
                str.substring(1, 3).toInt() *
                str.substring(3, 4).toInt()
        if (isReverse(str, a5.toString())) {
            println(str)
            continue
        }
        val a6 = str.substring(0, 2).toInt() *
                str.substring(2, 3).toInt() *
                str.substring(3, 4).toInt()
        if (isReverse(str, a6.toString())) {
            println(str)
            continue
        }
        val a7 = str.substring(0, 1).toInt() *
                str.substring(1, 2).toInt() *
                str.substring(2, 3).toInt() *
                str.substring(3, 4).toInt()
        if (isReverse(str, a7.toString())) {
            println(str)
            continue
        }
    }
}

fun isReverse(n1: String, n2: String): Boolean {
    return n1.reversed() == n2
}