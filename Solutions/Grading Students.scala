object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var grades = new Array[Int](n);
        for(grades_i <- 0 to n-1) {
           grades(grades_i) = sc.nextInt();
        }
        
        for(i <- Range(0,grades.length))
        {
            println(evaluateGrade(grades(i)))
        }
    }
    
    def evaluateGrade(n: Int): Int = (n % 5 > 2, n < 38) match {
        case (true, true) => n
        case (false, true) => n
        case (true, false) => n + (5 - (n % 5))
        case (false, false) => n
    }
}
