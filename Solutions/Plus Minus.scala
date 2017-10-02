object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.nextInt();
        }
        var pos = countPositive(arr)
        var neg = countNegetive(arr)
        var zeros = countZeros(arr)

        var d1:Double = (pos.toDouble / n.toDouble)
        var d2:Double = (neg.toDouble / n.toDouble)
        var d3:Double = (zeros.toDouble / n.toDouble)

        printf("%1.6f \n", d1)
        printf("%1.6f \n", d2)
        printf("%1.6f \n", d3)
}


def countPositive(a: Array[Int]): Int = {
  var num = 0

  for(i <- Range(0,a.length))
  {
    if(a(i) > 0) num = num + 1
  }

  return num
}

def countNegetive(a: Array[Int]): Int = {
  var num = 0

  for(i <- Range(0,a.length))
  {
    if(a(i) < 0) num = num + 1
  }

  return num
}

def countZeros(a: Array[Int]): Int = {
  var num = 0

  for(i <- Range(0,a.length))
  {
    if(a(i) == 0) num = num + 1
  }

  return num
}

}
