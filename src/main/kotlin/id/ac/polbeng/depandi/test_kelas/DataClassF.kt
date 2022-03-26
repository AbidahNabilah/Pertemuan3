package id.ac.polbeng.depandi.test_kelas

fun main() {
    val hazimah =Student("hazimah",17)
    // penggunaan kode program destrucing declarations menggunakan componentN()
    val name = hazimah.component1()
    val age = hazimah.component2()
    println("Name = $name")
    println("Age = $age")
}