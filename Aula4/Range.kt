fun main() {
  print("Valor min? ")
  val min = readln().toInt()
  print("Valor max? ")
  val max = readln().toInt()
  val range = min..max
  val size = range.count()
  println("$size valores em $range")
  println("Valor aleatório é ${range.random()}")
}