fun main() {
    println("Simple Kotlin Calculator")

    while (true) {
        println("\nEnter first number:")
        val num1 = readLine()?.toDoubleOrNull()
        if (num1 == null) {
            println("Invalid input. Please enter a number.")
            continue
        }

        println("Enter an operator (+, -, *, /):")
        val operator = readLine()

        println("Enter second number:")
        val num2 = readLine()?.toDoubleOrNull()
        if (num2 == null) {
            println("Invalid input. Please enter a number.")
            continue
        }

        val result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else {
                println("Error: Division by zero")
                null
            }
            else -> {
                println("Invalid operator")
                null
            }
        }

        if (result != null) {
            println("Result: $result")
        }

        
    }
}
