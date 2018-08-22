fun main(args: Array<String>) {
    println(cutBar(8, 3, 1))
    println(cutBar(20, 3, 1))
    println(cutBar(100, 5, 1))
}

fun cutBar(n: Int, m: Int, current: Int): Int {
    if (current >= n) {
        return 0
    } else if (current >= m) {
        return 1 + cutBar(n, m, current + m)
    } else {
        return 1 + cutBar(n, m, current * 2)
    }
}