fun main() {
    val cents = [50, 20, 10, 5, 2, 1]
    val euros = [200, 100]
    val coins = euros + cents
    println(coins)
    val coins2 = coins.filter{ it%2==0 }.map{ it/2 }
    println(coins2)
    val res = coins2.reduce{ a,b -> a + b }
    println(res)
    coins2.forEach{
        println(it)
    }
    repeat(3) {
        println(it)
    }
}
