package id.ac.polbeng.depandi.test_kelas

class InitOrder(name: String){
    val firstProperty = "First Property: $name".also(::println)
    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second property: ${name.length}".also (::println)
    init {
        println("Second initilalizer block that prints ${name.length
        }")
    }
}

fun main() {
    val initOrder = InitOrder("TI")
}