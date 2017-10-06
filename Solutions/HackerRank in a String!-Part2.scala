object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var q = sc.nextInt();
        var a0 = 0;
        var arr = new Array[String](q);
        var str = "hackerrank"
        
        for(arr_i <- 0 to q-1) {
           arr(arr_i) = sc.next();
        }
        
        for(i <- 0 to arr.length-1)
        {
            if(arr(i).length < str.length) println("NO")
            else
            {
                var j = 0
                for(k <- 0 to arr(i).length-1)
                {
                    if(j < str.length && arr(i).charAt(k) == str.charAt(j)) j = j + 1
                }
                if(j == str.length) println("YES") else println("NO")
            }
        }
        
    }
}
