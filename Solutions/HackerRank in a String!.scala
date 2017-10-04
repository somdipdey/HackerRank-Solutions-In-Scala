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
        
        for(i <- Range(0, arr.length)){
            var s = arr(i).toString
            if(s.count(_ == 'h') >= 1 & s.count(_ == 'a') >=2 && s.count(_ == 'c') >= 1 && s.count(_ == 'k') >= 2 && s.count(_ == 'e') >= 1 && s.count(_ == 'n') >= 1 && s.count(_ == 'r') >= 2 ) {
                var patrnSeq = 0
                for(j <- Range(0,str.length, 2)){
                    if(str.charAt(j).toString != "a" || str.charAt(j).toString != "r" ||
                      str.charAt(j+1).toString != "a" || str.charAt(j+1).toString != "r")
                    {
                        if(s.indexOf(str.charAt(j).toString) < s.indexOf(str.charAt(j+1).toString)) patrnSeq = patrnSeq + 1
                    }
                    else
                    {
                        if(s.lastIndexOf(str.charAt(j).toString) > s.lastIndexOf(str.charAt(j+1).toString)) patrnSeq = patrnSeq
                    }
                }
                if(patrnSeq == 4) println("YES")
                else println("NO")
            }
            else println("NO")
        }
        
    }
}
