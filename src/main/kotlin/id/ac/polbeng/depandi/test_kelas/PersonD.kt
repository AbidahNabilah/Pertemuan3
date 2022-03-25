package id.ac.polbeng.depandi.test_kelas

class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val abidah = PersonD("Abidah", "Nabilah", 21)
    println("Name : ${abidah.firstName} ${abidah.lastName}")
    println("Age : ${abidah.age}")
}