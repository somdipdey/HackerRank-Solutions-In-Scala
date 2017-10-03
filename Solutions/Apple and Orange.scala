object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.nextInt();
        var t = sc.nextInt();
        var a = sc.nextInt();
        var b = sc.nextInt();
        var m = sc.nextInt();
        var n = sc.nextInt();
        var apple = new Array[Int](m);
        for(apple_i <- 0 to m-1) {
           apple(apple_i) = sc.nextInt();
        }
        var orange = new Array[Int](n);
        for(orange_i <- 0 to n-1) {
           orange(orange_i) = sc.nextInt();
        }
        
        var rangeOfPointForHouse = s to t
        
        var listOfPointForHouse = rangeOfPointForHouse.toList
        
        var applesThatReachHouse = 0
        var orangesThatReachHouse = 0
        
        for(apple_i <- Range(0, apple.length)) {
          if(listOfPointForHouse contains (apple(apple_i) + a) ) {
              applesThatReachHouse = applesThatReachHouse + 1
          }
        }
        
        for(orange_i <- Range(0, orange.length)) {
          if(listOfPointForHouse contains (orange(orange_i) + b) ) {
            orangesThatReachHouse = orangesThatReachHouse + 1
          }
        }
        
        
        println(applesThatReachHouse)
        println(orangesThatReachHouse)
    }
}
