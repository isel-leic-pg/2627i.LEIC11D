import pt.isel.canvas.*

fun main() {
    onStart {
        val cv = Canvas(CELL_SIDE*COLS, CELL_SIDE*ROWS, BLACK)
        cv.drawGrid()
        var actor = Actor(Cell(ROWS/2, COLS/2), Dir.DOWN)
        cv.drawArena(actor)
        cv.onKeyPressed { ke ->
            actor = actor.moveByKey(ke)
            cv.drawArena(actor)
        }
    }
    onFinish {  }
}

private fun Canvas.drawArena(a: Actor) {
    erase()
    drawGrid()
    drawActor(a)
}