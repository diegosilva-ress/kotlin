fun main() {
    // Null Safety em Kotlin
    
    // 1. Tipos não-nulos por padrão
    var name: String = "John" // Não pode ser null
    // name = null // Erro de compilação!
    
    // 2. Tipos anuláveis (nullable)
    var nullableName: String? = "John" // Pode ser null
    nullableName = null // OK!
    
    // 3. Verificação segura de null
    if (nullableName != null) {
        println("Nome: $nullableName") // Safe dentro do if
    }
    
    // 4. Operador de chamada segura (?.)
    val length = nullableName?.length // Retorna null se nullableName for null
    println("Comprimento: $length")
    
    // 5. Operador Elvis (?:)
    val safeLength = nullableName?.length ?: 0 // Se null, usa 0
    println("Comprimento seguro: $safeLength")
    
    // 6. Operador de afirmação (!!) - Cuidado!
    // val dangerousLength = nullableName!!.length // Lança NullPointerException se for null
    
    // 7. Conversão segura para tipos não-nulos
    //processName(nullableName) // Não permite nullable
    processName(nullableName ?: "Desconhecido") // OK com valor padrão
}

fun processName(name: String) {
    println("Processando: $name")
}

// Exemplo de função que pode retornar null
fun findUser(id: Int): String? {
    return if (id == 1) "John" else null
}