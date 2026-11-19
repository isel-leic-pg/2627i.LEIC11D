import pt.isel.canvas.*

const val ROWS = 6
const val COLS = 8
const val CELL_SIDE = 128 // pixels

fun Canvas.drawGrid() {
    for(x in 0..width step CELL_SIDE)
        drawLine(x, 0, x, height, YELLOW)
    for(y in 0..height step CELL_SIDE)
        drawLine(0, y, width, y, YELLOW)
}

