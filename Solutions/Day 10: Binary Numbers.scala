object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var maxResult = 0
        
        var temp = n.toBinaryString.toInt
        var binaryList = temp.toString.toArray
        var consecutiveOnes = 0
        
        for(i <- 0 to binaryList.size - 1)
        {
                if(binaryList(i).toString == "1") consecutiveOnes = consecutiveOnes + 1
                else consecutiveOnes = 0
            if(maxResult < consecutiveOnes) maxResult = consecutiveOnes
        }
        
        println(maxResult)
    }
}
