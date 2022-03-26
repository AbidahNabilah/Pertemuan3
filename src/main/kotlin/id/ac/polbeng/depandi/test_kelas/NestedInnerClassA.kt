package id.ac.polbeng.depandi.test_kelas
// deklrasi dan inisialisasi Inner class
// inner class dapat mengakses data member dari kelas luar
class OuterA {
    val a = "Outside Nested class"
    inner class Inner {
        fun callMe() = a
    }
}

fun main() {
    val outer = OuterA()
    println("Using outer object: ${outer.Inner().callMe()}")
    val inner = OuterA().Inner()
    println("Using inner object: ${inner.callMe()}")
}