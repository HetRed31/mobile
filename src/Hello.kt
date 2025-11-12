import java.util.*    // Импорт Java-классов - использование Java класса Random из стандартной библиотеки

// Функции с возвращаемыми значениями - функция возвращает String
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

// Функции с возвращаемыми значениями - функция возвращает String
fun fishFood (day : String) : String {
    // Выражения when - аналог switch-case с возвратом значения
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    // Строковые шаблоны - использование $ для вставки переменных в строку
    println ("Today is $day and the fish eat $food")
    // Строковые шаблоны - использование ${} для вставки выражений
    println("Change water: ${shouldChangeWater(day)}")
}

// Параметры по умолчанию - temperature и dirty имеют значения по умолчанию
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    // Выражения when - использование с условиями без аргумента
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}

// Однострочные функции - компактный синтаксис для простых функций
fun isTooHot(temperature: Int) = temperature > 30

// Однострочные функции - функция записывается в одну строку
fun isDirty(dirty: Int) = dirty > 30

// Однострочные функции - возвращает результат сравнения
fun isSunday(day: String) = day == "Sunday"

// Логические предикаты - все три функции выше являются предикатами
// (возвращают true/false на основе условия)

fun main(args: Array<String>) {
    feedTheFish()
}
