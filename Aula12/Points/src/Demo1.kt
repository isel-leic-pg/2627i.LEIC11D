import pt.isel.canvas.*

fun main() {
    println("Start")
    onStart {
        val arena = Canvas(600,400,CYAN)
        arena.drawRect(10,10,580,380,BLUE)
        arena.drawCircle(arena.width/2, arena.height/2, 150, RED)
        val board = Canvas(389,250,WHITE)
        board.drawText(0,60,"Hello",BLACK,64)
        board.drawImage("isel-logo",0,60,380,177)
    }
    onFinish { }
    println("Bye")
}