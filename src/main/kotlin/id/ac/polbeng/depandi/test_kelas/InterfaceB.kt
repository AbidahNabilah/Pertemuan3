package id.ac.polbeng.depandi.test_kelas

interface Named{
    val name: String
}
interface Person :  Named{
    val firstName: String
    val lastName: String
    override val name: String get() = "$firstName $lastName"
}
data class EmployeeB(
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person

fun main() {
    val pegawai = EmployeeB("Ucok","Baba","Diplomat")
    println(pegawai.name)
}