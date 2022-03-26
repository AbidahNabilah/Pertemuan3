package id.ac.polbeng.depandi.test_kelas
// deklarasi dan inisialisasi Nested Class merupakan sebuah kelas dideklrasikan didalam kelas lain
class Outer {
    val a = "Outside Nested class"
    class Nested {
        val b = "Inside Nested class"
        fun callMe() = "Function call from inside Nested class"
    }
}

fun main() {
    println(Outer.Nested().b)
    val nested = Outer.Nested()
    println(nested.callMe())
}