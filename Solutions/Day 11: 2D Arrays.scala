object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var arr = Array.ofDim[Int](6,6);
        for(arr_i <- 0 to 6-1) {
           for(arr_j <- 0 to 6-1){
              arr(arr_i)(arr_j) = sc.nextInt();
           }
        }
        var A = scala.collection.mutable.ArrayBuffer.empty[Int]
        
        for (i <- 0 to 3) {
            for (j <- 0 to 3) {
                A += arr(i)(j) + arr(i)(j+1) + arr(i)(j+2) + arr(i+1)(j+1) + arr(i+2)(j) + arr(i+2)(j+1) + arr(i+2)(j+2)
            }
        }
        println(A.sorted.max)
    }
}
