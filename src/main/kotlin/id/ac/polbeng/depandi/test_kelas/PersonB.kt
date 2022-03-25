package id.ac.polbeng.depandi.test_kelas

class PersonB (_firstName: String, _lastName: String, _age:Int){
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}

fun main() {
    val abidah = PersonB("Abidah", "Nabilah", 20)
    println("Name: ${abidah.firstName} $(abidah.lastName")
    println("Age: ${abidah.age}")
}