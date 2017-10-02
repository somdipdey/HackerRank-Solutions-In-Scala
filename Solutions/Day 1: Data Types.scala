object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "
        val input1 = scala.io.StdIn.readLine()
        val input2 = scala.io.StdIn.readLine()
        val input3 = scala.io.StdIn.readLine()

        var v1: Int = (i.toInt + input1.toInt)
        var v2: Double = (d.toDouble + input2.toDouble)
        var v3: String = (s + input3)

        println(v1)
        println(v2)
        println(v3)
    }
}
