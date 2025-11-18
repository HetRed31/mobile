//package example.myapp
//import java.lang.Math.PI
//
//// Базовый класс аквариума с открытыми (наследуемыми) свойствами
//open class Aquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40)   {
//
//    // Объем аквариума в литрах с кастомными геттером и сеттером
//    open var volume: Int
//        // Вычисление объема: ширина * высота * длина / 1000 (перевод из см³ в литры)
//        get() = width * height * length / 1000
//        // При установке объема автоматически пересчитывается высота
//        set(value) {
//            height = (value * 1000) / (width * length)
//        }
//
//    // Форма аквариума по умолчанию - прямоугольник
//    open val shape = "rectangle"
//
//    // Количество воды в аквариуме (90% от объема)
//    open var water: Double = 0.0
//        // Вычисляемое свойство - всегда 90% от объема
//        get() = volume * 0.9
//
//    // Вторичный конструктор для создания аквариума по количеству рыб
//    constructor(numberOfFish: Int) : this() {
//        // Расчет необходимого объема: 2000 см³ на рыбу + 10% запас
//        val tank = numberOfFish * 2000 * 1.1
//        // Расчет высоты на основе необходимого объема
//        height = (tank / (length * width)).toInt()
//    }
//
//    // Метод для вывода информации о размерах аквариума
//    fun printSize() {
//        println(shape)
//        println("Width: $width cm " +
//                "Length: $length cm " +
//                "Height: $height cm ")
//        // Вывод объема и заполнения водой (в процентах)
//        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
//    }
//}
//
//// Специализированный класс цилиндрического аквариума-башни
//class TowerTank (override var height: Int, var diameter: Int):
//    Aquarium(height = height, width = diameter, length = diameter) {
//
//    // Переопределение объема для цилиндрической формы
//    override var volume: Int
//        // Формула объема эллипсоида: π * r1 * r2 * высота
//        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
//        // Сеттер пересчитывает высоту при изменении объема
//        set(value) {
//            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
//        }
//
//    // Переопределение количества воды - 80% от объема (меньше для цилиндра)
//    override var water = volume * 0.8
//
//    // Переопределение формы на "цилиндр"
//    override val shape = "cylinder"
//}