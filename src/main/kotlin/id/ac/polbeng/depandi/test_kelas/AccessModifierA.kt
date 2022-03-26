package id.ac.polbeng.depandi.test_kelas

open class Mahasiswa(var nama: String, var nrp:Int){
    open fun info(){
        println(nama +'\n' + nrp);
    }
    override fun toString(): String {
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}
class  KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp){
    @Override
    override fun info() {
        println(nama +'\n'+ nrp +'\n'+ jurusan);
    }
}

fun main() {
    val abidah = Mahasiswa("Abidah Nabilah", 6301224)
    val rikzy = KetuaHima("Rikzy", 89899, "Hubungan Internasional")
    println(rikzy.toString());

    println()
    rikzy.info()
    println("Jenis Kelas = "+ rikzy.javaClass.simpleName)

    println()
    abidah.info()
    println("Jenis Kelas = " + abidah.javaClass
        .simpleName)

    val ucok = KetuaHima("ucok", 990909, "TI")
    println()
    ucok.info()
    println("Jenis Kelas = " +  ucok.javaClass.simpleName)
}