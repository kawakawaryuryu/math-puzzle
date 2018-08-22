import java.util.*

/**
 * n = 20, m = 3 -> 正解
 * n = 100, m = 5 -> 不正解
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()

    val stick = BooleanArray(n + 1) // 初期値はfalseが入る
    stick[0] = true
    stick[n] = true
    var count = 0
    while (isNotCut(stick)) {
        var first = 0
        var knife = 0
        for (i in 1 until stick.size) {
            if (!isNotCut(stick.sliceArray(first..i))) {
                first = i
                continue
            }
            if (stick[i] && i - first > 1) {
                stick[(first + i) / 2] = true
                first = i
                knife++
                if (knife == m) break
            }
        }
        count++
    }

    println(count)
}

fun isNotCut(stick: BooleanArray): Boolean {
    return stick.contains(false)
}