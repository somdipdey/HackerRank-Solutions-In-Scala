object Solution {
    def main(args: Array[String]) = {
        
      //val sc = new java.util.Scanner (System.in);
        
      var inputPrice = scala.io.StdIn.readLine()
      var inputTipPerct = scala.io.StdIn.readLine()
      var inputTaxPerct = scala.io.StdIn.readLine()

      var mealCost: Double = inputPrice.toDouble
      var tipPercent: Double = inputTipPerct.toDouble
      var taxPercent: Double = inputTaxPerct.toDouble

      var amountTip = percentCalculator(mealCost, tipPercent)
      var amountTax = percentCalculator(mealCost, taxPercent)

      var totalCost = mealCost.toDouble + amountTip.toDouble + amountTax.toDouble

      printf("The total meal cost is %d dollars.", Math.round(totalCost))
    }

    def percentCalculator(cost: Double, percent: Double): Double = {
      return (cost * (percent / 100))
    }
}
