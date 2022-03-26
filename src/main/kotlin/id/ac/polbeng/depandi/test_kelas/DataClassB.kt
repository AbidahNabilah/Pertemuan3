package id.ac.polbeng.depandi.test_kelas
//deklrasi dan inisialisai Data class hashCode() and equals() methods
//unutk membandingkan nilai pada 2 buah objek dapat dilakukan dnegnamenggunakan fugsi equels(
fun main() {
    val abidah = Student("Abidah", 20)
    val newAbidah = Student("Abidah", 20)
    val hazimah = Student("Abidah", 20)
    if (abidah.equals(newAbidah))
        println("abidah is equel to newAbidah")
    else
        println("abidah is not equel to newAbidah")
    if (abidah.equals(hazimah))
        println("abidah is equel to hazimah")
    else
        println("abidah is not equel to hazimah")
    println("Hashcode of abidah: ${abidah.hashCode()}")
    println("Hashcode of newAbidah: ${newAbidah.hashCode()}")
    println("hashcode of hazimah: ${hazimah.hashCode()}")
}