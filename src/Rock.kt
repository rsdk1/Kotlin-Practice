import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val choices = listOf("rock", "paper", "scissors")
    val random = Random()

    println("🎮 Welcome to Rock, Paper, Scissors!")
    println("Type rock, paper, or scissors to play. Type exit to quit.")

    while (true) {
        print("Your choice: ")
        val userInput = scanner.nextLine().lowercase()

        if (userInput == "exit") {
            println("👋 Thanks for playing!")
            break
        }

        if (userInput !in choices) {
            println("❗ Invalid choice. Try again.")
            continue
        }

        val computerChoice = choices[random.nextInt(choices.size)]
        println("Computer chose: $computerChoice")
        when {
            userInput == computerChoice -> println("🤝 It's a tie!")
            userInput == "rock" && computerChoice == "scissors" ||
                    userInput == "paper" && computerChoice == "rock" ||
                    userInput == "scissors" && computerChoice == "paper" -> println("✅ WINNER CHICKEN DINNER!")
            else -> println("❌LOOSER!")
        }
    }
}
