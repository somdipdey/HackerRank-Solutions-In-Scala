object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.next();
        
        var occurence = collection.mutable.Map[String, Int]()
        val xs = s.toSet.toList
        val sAsList = s.toList
        
        for(c <- 0 to xs.size-1) occurence.put(xs(c).toString, sAsList.filter(_.toString == xs(c).toString).length.toInt)

        if(occurence.values.filter(x => (x % 2 == 1)).size > 1) println("NO") else println("YES")

    }
    
}
