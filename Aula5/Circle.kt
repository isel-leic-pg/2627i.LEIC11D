const val PI = Math.PI
	
fun main() {
	print("Raio? ")
	val radius: Double = readln().toDouble()
	println("Diametro = ${radius*2}")
	println("Perimetro = ${2*PI*radius}")
	println("Area = ${PI*radius*radius}")
}