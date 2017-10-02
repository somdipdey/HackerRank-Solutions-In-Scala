object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.next();
        
        var str = s.toString

        var i = 1
        while(i < str.length)
        {
            if((str.charAt(i)).toString == (str.charAt(i-1)).toString)
            {
                str = str.substring(0, i-1) + str.substring(i+1);
                i = 0;
            }
            i = i + 1
        }
        
        if(str.length > 0) println(str)
        else println("Empty String")
    }
    
}

