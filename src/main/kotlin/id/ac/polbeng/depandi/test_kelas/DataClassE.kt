package id.ac.polbeng.depandi.test_kelas
// deklarasi dan inisialisasi Data Classes and Destructuring Declarations: The componentN() method
// dapat mendestruksi data kelas sebiahobjek kedalam sejumlah variabel menggunakan destrucing declarations
fun main() {
    val hazimah = Student("Hazimah", 17)
    val(name, age) = hazimah
    println("Name = $name")
    println("Age = $age")
}