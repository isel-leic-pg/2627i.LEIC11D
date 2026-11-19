
enum class Signal(val stop: Boolean) {
    RED(true),
    ORANGE(false),
    GREEN(false)
}

fun main() {
    val state = Signal.RED
    println(state.ordinal)
    println(state.name)
    println(Signal.entries)
    println(state)
    println(isStop(state))
    println("green".toSignal())
}

fun isStop(s: Signal) = s.stop

fun String.toSignal(): Signal =
    when(this[0].uppercaseChar()) {
        'R' -> Signal.RED
        'O' -> Signal.ORANGE
        'G' -> Signal.GREEN
        else -> Signal.RED
    }