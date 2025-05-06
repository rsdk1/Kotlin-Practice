fun main()
{
    val str1 = "sweet"
    val str2 = "sweet"
    val str3 = String(charArrayOf('s', 'w', 'e', 'e', 't'))
    println(str1 == str2)
    println(str1 == str3)
    println(str1 === str3)
}
