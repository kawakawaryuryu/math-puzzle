import javax.script.ScriptEngineManager

/**
 * engineがnullになってしまうため現在は実行できない
 */
fun main(args: Array<String>) {
    val engine = ScriptEngineManager().getEngineByExtension("kts")
    // *(かける)以外を使うと必ず満たさないので除く
    val operators = arrayOf("*", "")
    for (num in 1000..9999) {
        val str = num.toString()
        operators.forEach { op1 ->
            operators.forEach { op2 ->
                operators.forEach { op3 ->
                    if (op1.isEmpty() && op2.isEmpty() && op3.isEmpty()) return
                    val ans = str[3] + op1 +  str[2] + op2 + str[1] + op3 + str[0]
                    if (str == engine.eval(ans).toString()) {
                        println(str)
                    }
                }
            }
        }
    }
}
