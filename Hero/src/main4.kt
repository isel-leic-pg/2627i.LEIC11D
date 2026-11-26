import pt.isel.canvas.*

fun main() {
    onStart {
        val cv = Canvas(CELL_SIDE*COLS, CELL_SIDE*ROWS, BLACK)
        var hero = Hero(
            actor = Actor(
                pos = Cell( row= ROWS/2, col= COLS/2),
                turn = Dir.DOWN
            ),
            anim = Anim.STAY
        )
        cv.drawArena(hero)
        cv.onKeyPressed { ke ->
            hero = hero.startMove(ke)
            cv.drawArena(hero)
        }
        cv.onTimeProgress(500) {
            if (hero.isWalk()) {
                hero = hero.nextAnim()
                cv.drawArena(hero)
            }
        }
    }
    onFinish {  }
}

fun Canvas.drawArena(h: Hero) {
    println(h)
    erase()
    drawGrid()
    drawActor(h.actor)
}