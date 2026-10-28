import pt.isel.canvas.*

fun main() {
    onStart {
        val arena = Canvas(600,400,CYAN)
        arena.drawCircle(arena.width/2, arena.height/2, 150, RED, 2)
        arena.onKeyPressed{ ke ->
            println(ke)
        }
    }
    onFinish { }
}