object Solution {

    def main(args: Array[String]) {
        val input = scala.io.StdIn.readLine()
        var noSpacedInput = input.replaceAll(" ", "")
        
        var alphabetSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toSet
        var mutAlphabetSet = collection.mutable.Set(alphabetSet.toArray:_*)
        
        for(i <- 0 to noSpacedInput.length-1)
        {
            val tempChar = Character.toUpperCase(noSpacedInput.charAt(i).toChar)
            mutAlphabetSet -= tempChar
        }

        if(mutAlphabetSet.isEmpty) println("pangram")
        else println("not pangram")
    }

}
