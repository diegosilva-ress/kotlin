fun main() {
    // Funções em Kotlin
    
    // 1. Chamando funções simples
    println("Soma: ${sum(5, 3)}")
    println("Mensagem: ${greet("João")}")
    
    // 2. Função sem retorno
    printMessage("Olá, Kotlin!")
    
    // 3. Argumentos nomeados
    greetPerson(name = "Maria", age = 25)
    greetPerson(age = 30, name = "Pedro") // Ordem diferente
    
    // 4. Valores padrão
    println("Padrão: ${greetWithDefault()}")
    println("Customizado: ${greetWithDefault("Ana")}")
    
    // 5. Funções de linha única
    val result = multiply(4, 5)
    println("Multiplicação: $result")
    
    // 6. Funções como expressão
    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter { isEven(it) }
    println("Pares: $evenNumbers")
    
    // 7. Funções anônimas (lambda)
    val square = { x: Int -> x * x }
    println("Quadrado de 6: ${square(6)}")
    
    // 8. Funções de ordem superior
    val doubled = numbers.map { double(it) }
    println("Dobrados: $doubled")
    
    // 9. Função com retorno múltiplo (Pair)
    val (min, max) = findMinMax(numbers)
    println("Min: $min, Max: $max")
    
    // 10. Função com varargs
    println("Soma variável: ${sumVarargs(1, 2, 3, 4, 5)}")
    println("Soma variável: ${sumVarargs(*intArrayOf(10, 20, 30))}")
    
    // 11. Função local (dentro de outra função)
    fun localFunction(x: Int): Int {
        return x * x * x
    }
    println("Cubo de 3: ${localFunction(3)}")
    
    // 12. Função recursiva
    println("Fatorial de 5: ${factorial(5)}")
}

// 1. Função básica com parâmetros e retorno
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 2. Função que retorna String
fun greet(name: String): String {
    return "Olá, $name!"
}

// 3. Função sem retorno (Unit)
fun printMessage(message: String) {
    println(message)
}

// 4. Função com múltiplos parâmetros
fun greetPerson(name: String, age: Int) {
    println("$name tem $age anos")
}

// 5. Função com valores padrão
fun greetWithDefault(name: String = "Visitante"): String {
    return "Bem-vindo, $name!"
}

// 6. Função de linha única (single-expression function)
fun multiply(a: Int, b: Int): Int = a * b

// 7. Função usada como predicado
fun isEven(number: Int): Boolean = number % 2 == 0

// 8. Função para ser usada em funções de ordem superior
fun double(x: Int): Int = x * 2

// 9. Função que retorna Pair
fun findMinMax(numbers: List<Int>): Pair<Int, Int> {
    return Pair(numbers.minOrNull() ?: 0, numbers.maxOrNull() ?: 0)
}

// 10. Função com número variável de argumentos (varargs)
fun sumVarargs(vararg numbers: Int): Int {
    return numbers.sum()
}

// 11. Função recursiva
fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

// 12. Função com parâmetro nullable
fun printLength(text: String?) {
    val length = text?.length ?: 0
    println("Comprimento: $length")
}

// 13. Função inline (otimização para funções de ordem superior)
inline fun measureTime(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    println("Tempo: ${end - start}ms")
}