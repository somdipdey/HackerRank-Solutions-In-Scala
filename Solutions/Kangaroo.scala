object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var x1 = sc.nextInt();
        var v1 = sc.nextInt();
        var x2 = sc.nextInt();
        var v2 = sc.nextInt();
        
        if(v2 == v1) println("NO")
        else if (v1 > v2) {
            if ((Math.abs(v2 - v1) != 0) && (x2 - x1) % (Math.abs(v2 - v1)) == 0 ) println("YES")
            else println("NO")
        }
        else if (v1 < v2){
            println("NO")
        }
        else println("YES")
    }
}
