package id.ac.polbeng.depandi.test_kelas

class Employee(_id: Int, _name:String, _age: Int) {
    val id: Int = _id
        get() = field // field untuk merujuk property didalam method getter dan setter

    var name: String = _name
        get() = field
        set(value) { // value adalah nama parameter setter
            field = value
        }

    var age: Int = _age
    get() = field
    set(value) {
        field = value
    }
}

fun main() {
    val emp = Employee(1108, "Abidah", 20)
    println("Id: ${emp.id} Nama: ${emp.name}, Umur : ${emp.age}")
}