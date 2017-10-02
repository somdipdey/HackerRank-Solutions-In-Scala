object Solution {

    def birthdayCakeCandles(n: Int, ar: Array[Int]): Int = {
    var temp:Array[Int] = ar.sorted
    var result = 0

    for(i <- Range((temp.length - 1), -1, -1))
    {
      if(temp(temp.length - 1) == temp(i)) result = result + 1
    }

    return result
}


    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var ar = new Array[Int](n);
        for(ar_i <- 0 to n-1) {
           ar(ar_i) = sc.nextInt();
        }
        val result = birthdayCakeCandles(n, ar);
        println(result)
    }
}

