import pt.isel.canvas.*

fun main() {
    onStart {
        val cv = Canvas(CELL_SIDE*COLS, CELL_SIDE*ROWS, BLACK)
        var pos = Cell(ROWS/2, COLS/2)
        cv.drawArena(pos)
        cv.onKeyPressed { ke ->
            pos = pos.moveByKey(ke)
            cv.drawArena(pos)
        }
    }
    onFinish {  }
}

fun Canvas.drawArena(p: Cell) {
    erase()
    drawGrid()
    val x = p.col * CELL_SIDE
    val y = p.row * CELL_SIDE
    drawImage("hero|48,0,48,48",x,y,CELL_SIDE,CELL_SIDE)
}