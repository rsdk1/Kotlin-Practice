fun main()
{
    val numbers = arrayOf(10, -2, 100, 25, -1)

    var largest = numbers[0]
    var smallest = numbers[0]

    for (num in numbers)
    {
        if (num > largest)
        {
            largest = num
        }
        if (num < smallest)
        {
            smallest = num
        }
    }

    println("Largest num: $largest")
    println("Smallest num: $smallest")
}
