package id.ac.polbeng.depandi.test_kelas
//private -> Pengaturan ini sama dengan visibility modifier private, tetapi instansiasi dapat
//juga dilakukan dari subclass (konsep inheritance)
private class privateExample {
    private val i = 1
    private fun doSomething(){
        println("Welcome to Private Acsess")
        println("Private Access : $i")
    }
    fun calldoSomething(){
        doSomething();
    }
}
//proctected ->Pengaturan ini sama dengan visibility modifier private, tetapi instansiasi dapat
//juga dilakukan dari subclass (konsep inheritance)
open class C() {
    protected val i = 1
}
class D : C() {
    fun getValue() : Int {
        println("Welcome to Protected access!")
        return i
    }
}
// internal
class internalExample {
    internal val i = 1
    internal fun doSomething(){
        println("Welcome to Internal Access!")
    }
}
//public -> dapat dilakukan diamanapun didalam dan luar program
class publicExample {
    val i = 1
    fun doSomething(){
        println("Welcome to Public Access!")
    }
}
fun main() {
    val objPrivate = privateExample()
    objPrivate.calldoSomething()
    val objProtected = D()
    println(println("Protected Access : ${objProtected.getValue()}"))
    val objInternal = internalExample()
    objInternal.doSomething()
    val objPublic = publicExample()
    objPublic.doSomething()
}
