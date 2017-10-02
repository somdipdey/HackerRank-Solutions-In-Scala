object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var a0 = sc.nextInt();
        var a1 = sc.nextInt();
        var a2 = sc.nextInt();
        var b0 = sc.nextInt();
        var b1 = sc.nextInt();
        var b2 = sc.nextInt();
        
                var AliceScore: Int = 0
        var BobScore: Int = 0

        if(isValid(a0))
        {
          if(a0 > b0) AliceScore = AliceScore + 1
          else if(a0 < b0) BobScore = BobScore + 1
        }

        if(isValid(a1))
        {
          if(a1 > b1) AliceScore = AliceScore + 1
          else if(a1 < b1) BobScore = BobScore + 1
        }

        if(isValid(a2))
        {
          if(a2 > b2) AliceScore = AliceScore + 1
          else if(a2 < b2) BobScore = BobScore + 1
        }

        println(AliceScore.toString + " " + BobScore.toString)
        
    }
    
    def isValid(thisNum: Int): Boolean = {
        val m = thisNum match {
        case x if 1 until 100 contains x => true
        case _ => false
    }
    return m
    }
}
