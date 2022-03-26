package id.ac.polbeng.depandi.test_kelas

data class Student(val name: String, val age: Int)

fun main() {
    val abidah = Student("abidah",20)
    val hazimah = Student("hazimah", 17)
    println("Student Name is: ${abidah.name}")
    println("Student Name is: ${abidah.age}")
    println("Student Name is: ${hazimah.name}")
    println("Student Name is: ${hazimah.age}")
}