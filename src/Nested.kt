fun main() {
    val a = 25
    val b = 38
    val c = 12

    var max: Int

    if (a > b) {
        if (a > c) {
            max = a
        } else {
            max = c
        }
    } else {
        if (b > c) {
            max = b
        } else {
            max = c
        }
    }

    println("The largest number is: $max")
}
