object Solution {

    def factorial(n: Int): Int =  {
       if(n==1) return 1
       return factorial(n-1) * n
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        val result = factorial(n);
        println(result)
    }
}

