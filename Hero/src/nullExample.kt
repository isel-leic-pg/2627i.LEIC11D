fun main() {
    useText("ISEL")
    useText("")
    useText(null)
}

fun useText(text :String?) {
    val len = text?.length ?: 0
    println("Length of $text = $len")
}

