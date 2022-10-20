fun main() {
    var vector1 = My3DVector(1,2,3)
    var vector2 = My3DVector(4,5,6)

    println(vector1)
    println(vector2)

    println("პირველი და მეორე ვექტორის სკალარული ნამრავლია: ${vector1.scalar(vector2)}")
    println("პირველი და მეორე ვექტორის ვექტორული ნამრავლია: ${vector1.crossProduct(vector2)}")

}

class My3DVector(var x:Int, var y:Int, var z:Int){
    fun scalar(classObject:My3DVector):Int{
        return x*classObject.x + y*classObject.y + z*classObject.z
    }
    fun crossProduct(classObject: My3DVector):String {
        return "(${y*classObject.z - z*classObject.y}; ${z*classObject.x - x*classObject.z}; ${x*classObject.y - y*classObject.x})"
    }
    override fun toString(): String {
        return "($x;$y;$z)"
    }


}
