fun main(args: Array<String>) {
    canAddFish(10.0, listOf(3,3,3))
    canAddFish(8.0, listOf(2,2,2), hasDecorations = false)
    canAddFish(9.0, listOf(1,1,3), 3)
    canAddFish(10.0, listOf(), 7, true)
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) {
    var totalSize = 0;
    for (fish in currentFish) {
        totalSize += fish;
    }
    if (hasDecorations) {
        if ((totalSize + fishSize) > 0.8 * tankSize) {
            println("false")
        } else {
            println("true")
        }
    } else {
        if ((totalSize + fishSize) > tankSize) {
            println("false")
        } else {
            println("true")
        }
    }
}
