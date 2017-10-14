object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        
        var temp = n.toBinaryString.toInt
        var listOfOnes = temp.toString.split("0").toList
        println(listOfOnes.max.size)
    }
}
