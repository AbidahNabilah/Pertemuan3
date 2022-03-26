package id.ac.polbeng.depandi.test_kelas
// penggunaan polymorphisme jenis dynamic polymorphisme terjadi ketika mendefinisikan beberapa fungsi yang override

open class MyBaase{
    open fun think(){
        println("Hey!! i am Queen")
    }
}
class  MyDerived: MyBaase(){
    override fun think() {
        println("I am a Darkness")
    }
}

fun main() {
    val myBaase = MyBaase()
    myBaase.think()
    var myDerived = MyDerived()
    myDerived.think()
}