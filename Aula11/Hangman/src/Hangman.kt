const val MAX_ERRORS = 6

fun main() {
    val secret = words.random().uppercase()
    val normalizedSecret = removePunctuation(secret)
    println(secret)
    var guessed: List<Char> = allSpaces(secret.length)
    var used = ""
    var errors = 0

    println(gallows[0])

    do {
        println(guessed.joinToString(" "))
        val guess = readGuess(used)
        used += guess
        if (guess in normalizedSecret)
            guessed = update(secret, normalizedSecret, guessed, guess)
        else
            println(gallows[++errors])
    } while (errors < MAX_ERRORS && !completed(guessed))
    val status = if (errors == MAX_ERRORS) "LOSE" else "WIN"
    println("YOU $status -> $secret")
}

val words = listOf(
    "algoritmo", "argumento", "avaliação", "base", "binário", "bit", "byte", "chamada",
    "ciclo", "comando", "compilador", "constante", "cursor", "código", "decisão",
    "diretoria", "escrita", "execução", "expressão", "ficheiro", "função", "imutável",
    "inferência", "instrução", "intervalo", "janela", "kotlin", "leitura", "linguagem",
    "lista", "memória", "operador", "parâmetro", "prioridade", "programa", "real",
    "repetição", "retorno", "sistema", "string", "tabela", "teclado", "tipo", "um",
    "valor", "variável", "zero"
)

val gallows: List<String> = listOf(
"""
 +---.
     |
     |
     |
=======
""",""" 
 +---.
 O   |
     |
     |
=======
""",""" 
 +---.
 O   |
 |   |
     |
=======
""",""" 
 +---.
 O   |
/|   |
     |
=======
""",""" 
 +---.
 O   |
/|\  |
     |
=======
""",""" 
 +---.
 O   |
/|\  |
/    |
=======
""",""" 
 +---.
 O   |
/|\  |
/ \  |
=======
"""
).map { it.trimIndent() }


/**
 * Gera uma lista de caracteres '_' com o tamanho especificado.
 * @param length O tamanho da lista a gerar.
 * @return A lista gerada de caracteres '_'.
 */
fun allSpaces(length: Int): List<Char> = List(length){ '_' }
    //return (1..length).map{ '_' }
/*
    var res: List<Char> = []
    for (i in 1..length) res = res + '_'
    return res
*/

/**
 * Lê uma tentativa e só retorna quando for lida uma só letra que ainda não foi usada.
 *
 * Antes de cada leitura apresenta as letras já usadas seguindo de ':'
 *
 * Por cada leitura não aceite é apresentada a mensagem "Invalid guess"
 *
 * @param used As letras já utilizadas nas tentativas
 * @return A letra introduzida pelo utilizador
 */
fun readGuess(used: String): Char {
    while(true) {
        print("$used: ")
        val line = readln().uppercase()
        if (line.length==1) {
            val letter = line[0]
            if (letter !in used) return letter
        }
        println("Invalid guess $line")
    }
}

/**
 * Retira os acentos e as cedilhas das letras.
 *
 * Exemplo: removePunctuation("FUNÇÃO") == "FUNCAO"
 *
 * @param s Palavra a considerar só com letras maiúsculas
 * @return A palavra sem acentos e cedilhas
 */
fun removePunctuation(s: String): String =
    s.map{ when(it) {
        'Ç' -> 'C'
        in "ÁÀÃÂ" -> 'A'
        in "ÉÈÊ" -> 'E'
        in "ÌÌ" -> 'I'
        in "ÓÒÕÔ" -> 'O'
        in "ÙÚ" -> 'U'
        else -> it
    } }.joinToString("")
/*
{
    var res = ""
    for(c in s){
        val r = when(c) {
            'Ç' -> 'C'
            in "ÁÀÃÂ" -> 'A'
            in "ÉÈÊ" -> 'E'
            in "ÌÌ" -> 'I'
            in "ÓÒÕÔ" -> 'O'
            in "ÙÚ" -> 'U'
            else -> c
        }
        res = res + r
    }
    return res
}
*/

/**
 * Retorna o novo estado da palavra descoberta.
 *
 * @param s A palavra escondida
 * @param s2 A palavra escondida sem acentos
 * @param w O estado atual da palavra a descobrir
 * @param c A letra da tentativa de descobrir
 * @return O novo estado da palavra a descobrir
 */
fun update(s: String, s2: String, w: List<Char>, c: Char): List<Char> =
    w.mapIndexed { idx, ch ->
        if (s2[idx] == c) s[idx] else ch
    }
/*
{
    var res: List<Char> = []
    for(idx in w.indices) {
        val x = if (s2[idx] == c) s[idx] else w[idx]
        res = res + x
    }
    return res
}
*/

/**
 * Verifica se já foram descobertas todas as letras.
 * @param w Estado atual da palavra a descobrir.
 * @return true se o estado atual tem as letras todas descobertas.
 */
fun completed(w: List<Char>): Boolean = w.none{ it=='_' }
/*
{
    for(e in w)
        if (e=='_') return false
    return true
}
*/

