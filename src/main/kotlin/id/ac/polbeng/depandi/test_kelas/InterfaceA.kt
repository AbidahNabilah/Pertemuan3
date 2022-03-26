package id.ac.polbeng.depandi.test_kelas
// deklrasi dan inisialisasi
interface MyInterface{
    var str: String
    fun demo()
    fun func(){
        println("Heloo")
    }
}
class MyClass: MyInterface{
    override var str: String = "Rekayasa Perangkat Lunak"
    override fun demo() {
        println("Demo Function")
    }
}
fun main() {
    val obj = MyClass()
    obj.demo()
    obj.func()
    println(obj.str)
}