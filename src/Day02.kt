/**
 * @author adyel
 * @since 12/2/21
 */


fun main() {
    val file = readInput("Input02")

    val resultOne = partOne(file)
    println("Result One: $resultOne")

    val resultTwo = partTwo(file)
    println("Result Two: $resultTwo")
}

fun partOne(file: List<String>): Int {
    var depth = 0
    var horizontalPosition = 0

    for (line in file) {
        val (command: String, value) = line.split(" ")

        when (command) {
            "forward" -> horizontalPosition += value.toInt()
            "down" -> depth += value.toInt()
            "up" -> depth -= value.toInt()
        }
    }

    return depth * horizontalPosition
}

fun partTwo(file: List<String>): Int {
    var depth = 0
    var aim = 0
    var horizontalPosition = 0

    for (line in file) {
        val (command: String, value) = line.split(" ")

        when (command) {
            "forward" -> {
                val intValue = value.toInt()
                horizontalPosition += intValue
                depth += aim * intValue
            }
            "down" -> aim += value.toInt()
            "up" -> aim -= value.toInt()
        }
    }

    return depth * horizontalPosition
}