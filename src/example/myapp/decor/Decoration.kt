package example.myapp.decor

interface FishColor {
    val color: String
}

// Singleton object
object GoldColor : FishColor {
    override val color = "gold"
}

// Enum class
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

// Добавьте этот enum Direction
enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}