fun main() {

    val file = readInput("Input01").map { it.toInt() }

    val partOneSolution = partOne(file)
    println("Part one: $partOneSolution")

    val partTwoSolution = partTwo(file)
    println("Part two: $partTwoSolution")
}

fun partTwo(file: List<Int>): Int {
    var counter = 0
    var previousWindow = file[0] + file[1] + file[2]

    for (i in 1..file.size - 3) {
        val currentWindow = file[i] + file[i + 1] + file[i + 2]
        if (currentWindow > previousWindow) {
            counter++
        }
        previousWindow = currentWindow
    }

    return counter
}

fun partOne(file: List<Int>): Int {
    var counter = 0
    var previousReading = Int.MAX_VALUE

    for (line in file) {
        if (previousReading < line) {
            counter++
        }
        previousReading = line
    }

    return counter
}
