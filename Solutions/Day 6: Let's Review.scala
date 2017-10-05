object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        val n = sc.nextInt();
        var arr = new Array[String](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.next();
        }
        
        for(i <- 0 to n-1)
        {
            var s = arr(i)
            var leftSide = ""
            var rightSide = ""
            for(j <- 0 to s.length -1)
            {
                if(j % 2 == 0) leftSide = leftSide + s.charAt(j).toString
                else if(j % 2 == 1) rightSide = rightSide + s.charAt(j).toString
            }
            println(leftSide + " " + rightSide)
        }
    }
}
