fun main(args: Array<String>) {
    for (num in 11..100000 step 2) {
        if (num.toString() == num.toString().reversed()
                && num.toString(2) == num.toString(2).reversed()
                && num.toString(8) == num.toString(8).reversed()) {
            println(num)
            break
        }
    }
}