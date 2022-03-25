package id.ac.polbeng.depandi.test_kelas

class PersonC (var firstName: String, var lastName: String, var age:Int){

}

fun main() {
    val abidah = PersonC("Abidah", "Nabilah", 21)
    println("Name : ${abidah.firstName} ${abidah.lastName}")
    println("Age: ${abidah.age}")
}