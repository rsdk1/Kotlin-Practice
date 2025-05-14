import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 100)
    var guess: Int?
    var attempts = 0

    println("Welcome to the Num Guessing Game!")
    println("I'm thinking of a number between 1 and 100. Can you guess it?")

    do {
        print("Enter your guess: ")
        guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("❗ Please enter a valid number.")
            continue
        }

        attempts++

        when {
            guess < secretNumber -> println("📉 Too low!")
            guess > secretNumber -> println("📈 Too high!")
            else -> println("✅ Correct! You guessed it in $attempts attempts.")
        }

    } while (guess != secretNumber)
}
