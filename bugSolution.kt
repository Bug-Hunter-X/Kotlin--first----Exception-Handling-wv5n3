fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    //Safe handling of empty list
    val firstElement = list.firstOrNull() ?: 0
    println(firstElement) // Output: 1

    val emptyList = emptyList<Int>()
    val firstElementEmpty = emptyList.firstOrNull() ?: 0
    println(firstElementEmpty) //Output: 0
}