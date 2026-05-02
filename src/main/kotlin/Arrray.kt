fun main() {
    // Arrays em Kotlin
    
    // 1. Array de tamanho fixo
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println("Array numbers: ${numbers.contentToString()}")
    
    // 2. Array de strings
    val names = arrayOf("Ana", "João", "Maria")
    println("Array names: ${names.contentToString()}")
    
    // 3. Array com tipo específico
    val doubles: DoubleArray = doubleArrayOf(1.5, 2.5, 3.5)
    println("Array doubles: ${doubles.contentToString()}")
    
    // 4. Array de caracteres
    val chars = charArrayOf('a', 'e', 'i', 'o', 'u')
    println("Array chars: ${chars.contentToString()}")
    
    // 5. Array booleano
    val booleans = booleanArrayOf(true, false, true)
    println("Array booleans: ${booleans.contentToString()}")
    
    // 6. Acessando elementos
    println("Primeiro elemento: ${numbers[0]}")
    println("Último elemento: ${numbers[numbers.size - 1]}")
    
    // 7. Modificando elementos (arrays são mutáveis)
    numbers[0] = 10
    println("Array modificado: ${numbers.contentToString()}")
    
    // 8. Percorrendo arrays
    println("\nPercorrendo com for:")
    for (num in numbers) {
        print("$num ")
    }
    
    println("\n\nPercorrendo com forEach:")
    numbers.forEach { num ->
        print("$num ")
    }
    
    // 9. Operações úteis
    println("\n\nTamanho: ${numbers.size}")
    println("Primeiro elemento: ${numbers.first()}")
    println("Último elemento: ${numbers.last()}")
    println("Maior elemento: ${numbers.maxOrNull()}")
    println("Menor elemento: ${numbers.minOrNull()}")
    println("Soma: ${numbers.sum()}")
    println("Média: ${numbers.average()}")
    
    // 10. Filtrando e transformando
    val pares = numbers.filter { it % 2 == 0 }
    println("\nNúmeros pares: $pares")
    
    val quadrados = numbers.map { it * it }
    println("Quadrados: $quadrados")
    
    // 11. Verificando elementos
    println("Contém 3? ${3 in numbers}")
    println("Contém 100? ${100 in numbers}")
    
    // 12. Array vazio
    val emptyArray = emptyArray<Int>()
    println("\nArray vazio: ${emptyArray.contentToString()}")
    println("Está vazio? ${emptyArray.isEmpty()}")
}