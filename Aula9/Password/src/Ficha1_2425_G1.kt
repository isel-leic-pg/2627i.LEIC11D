//Grupo 1
inline fun <reified T: Any> printValueAndType(exp: T) {
    println("Value: $exp , Type: ${exp::class.simpleName}")
}

fun main() {
    val i=3.7F
    val txt="2024"
    val c=true

    printValueAndType(i + 2)
    printValueAndType(c && i > 3)
    printValueAndType(txt[i.toInt()])
    printValueAndType(txt.length > i == c)
    printValueAndType(txt + c)
    //printValueAndType(txt[1]==c)
    //printValueAndType(txt % 2)
    printValueAndType(txt[1]+2)
    printValueAndType('3'-txt[1])
    printValueAndType('2' in txt[3]..'9')
    printValueAndType(if (i>=0) 1 else 2)
    printValueAndType(i + 0x02)
}