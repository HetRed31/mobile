package example.myapp
import example.myapp.decor.Choice
import example.myapp.decor.Direction



fun main () {
//    buildAquarium()1
//    makeFish()
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
}




//fun buildAquarium() {
//    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
//    myAquarium.printSize()
//    val myTower = TowerTank(diameter = 25, height = 40)
//    myTower.printSize()
//}
//
//
//fun makeFish() {
//    val shark = Shark()
//    val pleco = Plecostomus()
//    println("Shark: ${shark.color}")
//    shark.eat()
//    println("Plecostomus: ${pleco.color}")
//    pleco.eat()
//}