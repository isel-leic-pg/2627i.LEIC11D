fun main() {
    val cents = [50, 20, 10, 5, 2, 1]
    val euros = [200, 100]
    val coins = euros + cents
    println(coins)
    val coins2 = filterPair(coins)
    println(coins2)
    val coins3 = filterBy(coins, { e -> e%2!=0 } )
    println(coins3)
}

fun filterBy(l: List<Int>, fx: (Int)->Boolean): List<Int> {
    var res: List<Int> = []
    for(e in l)
        if ( fx(e) ) res = res + e
    return res
}

fun filterPair(l: List<Int>): List<Int> =
    filterBy(l, { it%2==0 })