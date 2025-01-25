fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    //This code will throw an exception if the list is empty
    val firstElement = list.first()
    println(firstElement) //Output: 1
}