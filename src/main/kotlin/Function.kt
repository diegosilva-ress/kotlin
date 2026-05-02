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
    
    // 8. Função local (dentro de outra função)
    fun localFunction(x: Int): Int {
        return x * x * x
    }
    println("Cubo de 3: ${localFunction(3)}")
    

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
fun multiply(a: Int, b: Int): Int = a * b // Não precisa de return

// 7. Função usada como predicado
fun isEven(number: Int): Boolean = number % 2 == 0 // Não precisa de return

// 8. Função anônima
val area = { width: Int, height: Int -> width * height }

