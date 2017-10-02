object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var N = sc.nextInt();
        
        println(isItWeird(N))
    }
    
    def isItWeird(n: Int): String = (n % 2 == 0, n >= 2, n <= 5, n >= 6, n <= 20, n > 20) match {
        case(true, true, true, false, true, false) => "Not Weird"
        case(true, false, false, true, true, false) => "Weird"
        case(true, true, false, true, false, true) => "Not Weird"
        case(false, false, false, false, false, false) => "Weird"
        case(_,_,_,_,_,_) => "Weird"
    }
}

