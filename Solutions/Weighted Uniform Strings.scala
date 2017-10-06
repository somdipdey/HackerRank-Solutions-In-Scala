object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.next();
        var n = sc.nextInt();
        var prev = -1
        var numArray = collection.mutable.MutableList[Int]()
        var digitArray = collection.mutable.MutableList[Int]()
        var a0 = 0;
        while(a0 < n){
            var x = sc.nextInt();
            numArray += x
            a0+=1;
        }
        
        var i = 0
        while(i < s.length)
        {
            if(i+1 < s.length)
            {
                if(s.charAt(i) == s.charAt(i+1))
                {
                    digitArray += s.charAt(i).toInt - 96
                    var j = 1
                    while(s.charAt(i) == s.charAt(i+1))
                    {
                        digitArray += (s.charAt(i).toInt - 96)*(j+1)
                        j = j + 1
                        i = i + 1
                    }
                }
                else digitArray += s.charAt(i).toInt - 96
            }
            else digitArray += s.charAt(i).toInt - 96
            i = i + 1
        }
        
        numArray.foreach((x) => if(digitArray contains x) println("Yes") else println("No") )
    }
}

