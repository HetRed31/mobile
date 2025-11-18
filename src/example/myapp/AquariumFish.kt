//package example.myapp
//
//// Интерфейс для определения действия рыбы - питания
//interface FishAction {
//    fun eat()  // Метод, который должна реализовать каждая рыба
//}
//
//// Интерфейс для определения цвета рыбы
//interface FishColor {
//    val color: String  // Свойство цвета, которое должно быть реализовано
//}
//
//// Класс Плекостомус - использует делегирование для реализации интерфейсов
//class Plecostomus (fishColor: FishColor = GoldColor):
//    FishAction by PrintingFishAction("eat algae"),  // Делегирование метода eat() классу PrintingFishAction
//    FishColor by fishColor  // Делегирование свойства color переданному объекту FishColor
//
//// Класс Акула - прямая реализация интерфейсов
//class Shark: FishAction, FishColor {
//    override val color = "grey"  // Прямое определение цвета
//    override fun eat() {
//        println("hunt and eat fish")  // Прямая реализация метода питания
//    }
//}
//
//// Объект-одиночка (Singleton) для золотого цвета
//object GoldColor : FishColor {
//    override val color = "gold"  // Единственный экземпляр золотого цвета
//}
//
//// Класс-делегат для реализации действия питания
//class PrintingFishAction(val food: String) : FishAction {
//    override fun eat() {
//        println(food)  // Просто выводит переданную строку с едой
//    }
//}