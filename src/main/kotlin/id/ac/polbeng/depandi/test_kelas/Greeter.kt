package id.ac.polbeng.depandi.test_kelas

class Greeter {
    var text:String = ""
    fun greet() {
        println("Hello object world!") // merupaka sebuah fungsi
    }
    fun greet(name: String){
        println("$text $name")  //menggunakan konsep overloading
    }
    fun with_ret_val(name: String): String{
        return "$text $name"
    }
    fun greet(age: Int){
        print("$age tahun")
    }
}
//overriding menulis kembali oleh class anaknya
//overloading ditulis kembali sendiri, membuat sebuah method dengan aksis yang didalamnya berbeda
// overloading memiliki nama yang sama dalam 1 kelas, tetapi memiliki karateristik parameter yang berbeda dan jumlah parameter nya tidak sama
//