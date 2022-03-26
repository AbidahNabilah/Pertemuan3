package id.ac.polbeng.depandi.test_kelas

open class Rectangle {
    open fun draw(){
        println("From Bassse Class Rectangle")
    }
}
interface  Polygon {
    fun draw(){
        println("From Interface Polygon")
    }
}
class Square() : Rectangle(), Polygon{
    override fun draw() {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}

fun main() {
    val square = Square()
    square.draw()
}