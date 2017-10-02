object Solution {

    def timeConversion(s: String): String =  {
        if((s slice (8,10)) == "PM")
        {
          if((s slice (0, 2)) != "12"){
            var hhString = (s slice (0, 2) )
            var hh = hhString.toInt
            hh = hh + 12
            var result = hh.toString + (s slice (2, 8) )
            return result
          }
          else return s slice (0, 8)
        }
        else {
          if((s slice (0, 2)) != "12"){
            return s slice (0, 8)
          }
          else{
            return "00" + (s slice (2, 8) )
          }
      }
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.next();
        val result = timeConversion(s);
        println(result)
    }
}

