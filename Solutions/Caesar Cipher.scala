object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var s = sc.next();
        var k = sc.nextInt();
        var e: String = ""

        for(i <- Range(0,s.length))
        {
            if(s.charAt(i).toInt >= 65 && s.charAt(i).toInt <= 90)
            {
                if(s.charAt(i).toInt + (k % 26) <= 90) e = e + (s.charAt(i).toInt + (k % 26)).toChar.toString
                else e = e + (s.charAt(i).toInt + (k % 26) - 90 + 64).toChar.toString
            }
            else if(s.charAt(i).toInt >= 97 && s.charAt(i).toInt <= 122)
            {
                if(s.charAt(i).toInt + (k % 26) <= 122) e = e + (s.charAt(i).toInt + (k % 26)).toChar.toString
                else e = e + (s.charAt(i).toInt + (k % 26) - 122 + 96).toChar.toString
            }
            else e = e + s.charAt(i).toString
        }

        println(e)
    }
}
