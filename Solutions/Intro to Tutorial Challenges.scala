object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var V = sc.next();      
        var n = sc.nextInt();
        var ar = new Array[Int](n);
        for(ar_i <- 0 to n-1) {
           ar(ar_i) = sc.nextInt();
        }
        
        for(i <- 0 to n-1)
        {
            if(V.toInt == ar(i).toInt) println(i)
        }
    }
}
