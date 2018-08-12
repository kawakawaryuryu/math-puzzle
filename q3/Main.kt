fun main(args: Array<String>) {
    val card = Array(100) { _ -> false }
    for (i in 2..100) {
        for (j in i..100 step i) {
            card[j-1] = !card[j-1]
        }
    }

    for (i in card.indices) {
        if (!card[i]) print("${i+1} ")
    }
    println()
}