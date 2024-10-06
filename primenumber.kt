fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    if (number == 2 || number == 3) return true
    if (number % 2 == 0 || number % 3 == 0) return false

    var i = 5
    while (i * i <= number) {
        if (number % i == 0 || number % (i + 2) == 0) return false
        i += 6
    }
    return true
}

fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        if (isPrime(number)) {
            println("$number is a prime number.")
        } else {
            println("$number is not a prime number.")
        }
    } else {
        println("Please enter a valid number.")
    }
}
