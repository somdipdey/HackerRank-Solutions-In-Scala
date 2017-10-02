object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var arr = new Array[Long](5);
        for(arr_i <- 0 to 5-1) {
           arr(arr_i) = sc.nextInt();
        }
        println(Min(arr) + " " + Max(arr))

}

def Max(a: Array[Long]): Long = {
  var max: Long = 0
  for(i <- Range(0, a.length))
  {
    val thismax = a.sum - a(i)

    if(max < thismax) max = thismax.toLong
  }

  return max
}

def Min(a: Array[Long]): Long = {
  var min: Long = 99999999999L;
    
  for(i <- Range(0, a.length))
  {
    val thismax = a.sum - a(i)

    if(min > thismax) min = thismax.toLong
  }

  return min
}

}

