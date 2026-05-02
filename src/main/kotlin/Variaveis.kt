fun main() {
    // var: variável mutável (pode ser alterada após a declaração)
    var name: String = "John" // String
    
    // val: variável imutável (não pode ser alterada após a declaração). É uma constante
    val birthyear: Int = 1975 // Int

    // a variável pode ser criada sem declarar o tipo
    val city = "Brasília"

    println(name)
    println(birthyear)
    println(city)

    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    var name2: String
    name2 = "John"
    println(name2)

//   Gera erro. Se a var for atribuida depois da criação, o tipo precisa ser explicito
//    var name
//    name = "John"
//    println(name)
}