import pt.isel.canvas.KeyEvent

enum class Anim{ STAY, START, MIDDLE, END }

fun Anim.next() = when (this) {
    Anim.START -> Anim.MIDDLE
    Anim.MIDDLE -> Anim.END
    Anim.END -> Anim.STAY
    Anim.STAY -> Anim.STAY
}

data class Hero(val actor: Actor, val anim: Anim)

fun Hero.isWalk(): Boolean = anim != Anim.STAY

fun Hero.startMove(k: KeyEvent): Hero {
    if (isWalk())
        return this
    val a = actor.moveByKey(k)
    return Hero(a, Anim.START)
}

fun Hero.nextAnim(): Hero = copy(anim = anim.next())
