object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = Array.ofDim[Int](n,n);
        for(a_i <- 0 to n-1) {
           for(a_j <- 0 to n-1){
              a(a_i)(a_j) = sc.nextInt();
           }
        }
        
        val N:Int = n.toInt
        var diagonalRightSide = sumDiagonal(a, N, true)
        var diagonalLeftSide = sumDiagonal(a, N, false)

        var temp = (diagonalRightSide.toInt - diagonalLeftSide.toInt)
        
        var abs = Math.abs(temp)

        println(abs)
}

def sumDiagonal(a:Array[Array[Int]], n:Int, rightSide:Boolean): Int = {
  var sum:Int = 0
  if(rightSide){
    for(i <- Range(0,n)){
      sum = sum + a(i)(i)
    }
  }
  else{
    for(i <- Range(0,n)){
      sum = sum + a(i)((n-1)-i)
    }
  }

  return sum
}
    
}

