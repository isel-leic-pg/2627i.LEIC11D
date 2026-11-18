import pt.isel.canvas.*

fun main() {
    onStart {
        val cv = Canvas(CELL_SIDE*COLS, CELL_SIDE*ROWS, BLACK)
        cv.drawGrid()
        var pos = Cell(ROWS/2, COLS/2)
        cv.drawHero(pos)
        cv.onKeyPressed { ke ->
            val dir: Dir = dirOf(ke.code)
            pos = Cell(pos.row + dir.dRow, pos.col + dir.dCol)
            cv.drawHero(pos)
        }
    }
    onFinish {  }

    val d = Dir.LEFT
    println(d)
    println(d.ordinal)
    println(Dir.entries)
    println(d.name)
}

enum class Dir(val dRow: Int, val dCol: Int) {
    DOWN(1,0), UP(-1,0), LEFT(0,-1), RIGHT(0,1),
    NONE(0,0)
}

fun dirOf(keyCode: Int): Dir = when (keyCode) {
    UP_CODE -> Dir.UP
    DOWN_CODE -> Dir.DOWN
    LEFT_CODE -> Dir.LEFT
    RIGHT_CODE -> Dir.RIGHT
    else -> Dir.NONE
}

fun Canvas.drawHero(p: Cell) {
    erase()
    drawGrid()
    val x = p.col * CELL_SIDE
    val y = p.row * CELL_SIDE
    drawImage("hero|48,0,48,48",x,y,CELL_SIDE,CELL_SIDE)
}