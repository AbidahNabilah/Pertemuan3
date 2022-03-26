package id.ac.polbeng.depandi.test_kelas

abstract class Vehicle(val name: String, val color: String, val weight: Double){

    abstract var maxSpeed: Double
    abstract fun start()
    abstract fun stop()
    abstract fun sound()

    fun displayDetails() {
        println("Name: $name, Color: $color, Weight: $weight, Max Speed:$maxSpeed")
    }
}
class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
        // Code to start a Car
        println("Car Started")}

    override fun stop() {
        println("Car Stopped")
    }

    override fun sound() {
        println("Brum..Brum..Brumm")
    }
}
class Motorcycle(name: String, color: String, weight: Double,
                 override var maxSpeed: Double): Vehicle(name, color, weight) {
        override fun start() {
        println{"BiKE Started"}
    }

    override fun stop() {
        println("Bike Stop")
    }

    override fun sound() {
        println("Preng...Preng..Preng")
    }
                 }

fun main() {
    val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
    val motorCycle = Motorcycle("Ducati 1098s", "red", 173.0, 271.0)
    car.displayDetails()
    motorCycle.displayDetails()
    car.start()
    car.sound()
    car.stop()
    motorCycle.start()
    motorCycle.sound()
    motorCycle.stop()
}


