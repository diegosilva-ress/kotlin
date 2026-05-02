// Classe base (aberta para herança)
open class Person(val name: String, var age: Int) {
    open fun greet() {
        println("Olá, $name! Você tem $age anos.")
    }
    
    open fun work() {
        println("$name está trabalhando...")
    }
}

// Subclasse Employee que herda de Person
class Employee(name: String, age: Int, val company: String, var salary: Double) : Person(name, age) {
    
    override fun greet() {
        println("Olá! Sou $name, funcionário da $company e tenho $age anos.")
    }
    
    override fun work() {
        println("$name está trabalhando na $company.")
    }
    
    fun promote() {
        salary *= 1.1
        println("$name foi promovido! Novo salário: R$ $salary")
    }
}

// Subclasse Student que herda de Person
class Student(name: String, age: Int, val school: String, var grade: Double) : Person(name, age) {
    
    override fun greet() {
        println("Oi! Sou $name, estudante da $school e tenho $age anos.")
    }
    
    override fun work() {
        println("$name está estudando para as provas.")
    }
    
    fun study(hours: Int) {
        grade += hours * 0.1
        println("$name estudou $hours horas. Nova nota: $grade")
    }
}

fun main() {
    // Criando objetos das diferentes classes
    val person = Person("Carlos", 45)
    val employee = Employee("Ana", 28, "Tech Corp", 5000.0)
    val student = Student("Lucas", 20, "Universidade Federal", 8.5)
    
    println("=== DEMONSTRAÇÃO DE HERANÇA ===")
    
    // Usando os métodos
    person.greet()
    person.work()
    
    println()
    
    employee.greet()
    employee.work()
    employee.promote()
    
    println()
    
    student.greet()
    student.work()
    student.study(5)
    
    println("\n=== POLIMORFISMO ===")
    
    // Array de Person contendo diferentes subclasses
    val people: Array<Person> = arrayOf(person, employee, student)
    
    for (p in people) {
        p.greet()  // Chama o método override de cada subclasse
        p.work()   // Chama o método override de cada subclasse
        println("---")
    }
}

