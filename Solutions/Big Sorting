object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var unsorted = new Array[String](n);
        for(unsorted_i <- 0 to n-1) {
           unsorted(unsorted_i) = sc.next();
        }

        var u_sorted = new Array[scala.math.BigInt](n)
        
        for(i <- 0 to n-1)
        {
            u_sorted(i) = BigInt(unsorted(i).toString)
        }
        var sorted = u_sorted.sorted
        
        for(i <- 0 to n-1)
        {
            println(sorted(i).toString)
        }
    }
}
