object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var S = sc.next();
        var screwedSOS = 0
            for(i <- Range(0, S.length, 3))
            {
                if(S.charAt(i).toString + S.charAt(i+1).toString + S.charAt(i+2).toString != "SOS")
                {
                    if(S.charAt(i).toString != "S") screwedSOS = screwedSOS + 1
                    if(S.charAt(i+1).toString != "O") screwedSOS = screwedSOS + 1
                    if(S.charAt(i+2).toString != "S") screwedSOS = screwedSOS + 1
                }
            }
            println(screwedSOS)
    }
}
