package id.ac.polbeng.depandi.test_kelas
//deklarasi dan inisialisasi dengan Data class copy() method
// untuk membuat sebuah objek salinan dengan beberapa property yang berbeda menggunakan fungsi
fun main() {
    val hazimah = Student("Hazimah",20)
    val ahmad = hazimah.copy("Ahmad")
    if (hazimah.equals(ahmad))
        println("hazimah is equel to ahmad")
    else
        println("hazimah is not equel to ahmad")
    println("Hashcode of meri: ${hazimah.hashCode()}")
    println("Hashcode of ahmad: ${ahmad.hashCode()}")
}