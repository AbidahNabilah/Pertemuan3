package id.ac.polbeng.depandi.test_kelas
// parent class
open class Computer (val name: String, val brand: String){
}

//child class
class Laptop(name: String, brand: String, val batteryLife: Double) : Computer(name, brand){
    fun info(){
        println("Name: $name")
        println("Branf: $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main() {
    val myLaptop = Laptop("Asus VivoBook XFN600", "Asus", 2.5)
    println(myLaptop.info())
}