fun main() {
	print("Nome? ")
	val name = readln()
	val first = name[0]
	println("Primeira letra = $first")
	println("Última letra = ${name[name.length-1]}")
}