object Solution {

    def main(args: Array[String]) {
        val num = scala.io.StdIn.readLine()
        var thisMap = collection.mutable.Map.empty[String, Long]
        for(i <- 0 to num.toInt-1) {
           val tempKeyValue = scala.io.StdIn.readLine();
            val keyAndValue = tempKeyValue.split(" ");
            thisMap += (keyAndValue(0).toString -> keyAndValue(1).toLong)
        }
        
        val inputLines = Iterator.continually(scala.io.StdIn.readLine()).takeWhile(_ != null).mkString(" ").split(" ")
        
        for(i <- 0 to inputLines.size -1)
        {
            if(thisMap contains inputLines(i)) println(inputLines(i) + "=" + thisMap(inputLines(i)))
            else println("Not found")
        }
    }
}
