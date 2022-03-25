package id.ac.polbeng.depandi.test_kelas

class PersonF (val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi, ok!")
    }
    constructor(_firstName: String, _lastName: String, _age:Int): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName: String, _country:String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName: String, _age:Int, _country: String): this(_firstName, _lastName, _age){
        println("Name  : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}

fun main() {
    val a = PersonF("Abidah", "Nabilah")
    val b = PersonF("Wang", "Yibo", 24)
    val c = PersonF("Xiao","Zhan","China")
    val d = PersonF("Byun", "Baekhyun", 30, "Korea Selatan")
}