package id.ac.polbeng.depandi.test_kelas

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25
    constructor(_firstName: String, _lastName:String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age:Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name: ${firstName} ${lastName}")
        println("Age :  ${age}")
    }
}

fun main() {
    val a = PersonE("Wang", "Yibo")
    a.cetakInfo()
    val b = PersonE("Xiao", "Zhan", 30)
    b.cetakInfo()
}