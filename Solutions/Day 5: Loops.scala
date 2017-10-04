object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        
        for(i <- 1 to 10)
        {
            println(s"$n x $i = "+(n*i).toString)
        }
    }
}
