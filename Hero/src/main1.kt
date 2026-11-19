import pt.isel.canvas.*

/**
 * Displays a grid and the hero in center.
 */
fun main() {
    onStart {
        val cv = Canvas(CELL_SIDE*COLS, CELL_SIDE*ROWS, BLACK)
        cv.drawGrid()
        val x = COLS/2*CELL_SIDE
        val y = ROWS/2*CELL_SIDE
        cv.drawImage("hero|48,0,48,48",x,y,CELL_SIDE,CELL_SIDE)
    }
    onFinish {  }
}