object Solution {

    def main(args: Array[String]) {
        var T=scala.io.StdIn.readInt()
        var i=0
        for(i<-1 to T){        
             var age=scala.io.StdIn.readInt()
             var p=new Person(age)
             p.amIOld()
             var j=0
             for(j<-1 to 3){
                 p.yearPasses()
             }
             p.amIOld()
             System.out.println()

        }


    }
}

//class Person starts here -->

class Person {

    var age: Int = 0

    def this(initialAge:Int) = {
        this()
        
        if(initialAge < 0) {
            age = 0
            println("Age is not valid, setting age to 0.")
        }
        else {
            age = initialAge
            
        }

       
    }        

    def amIOld(): Unit = {
       if(age < 13) println("You are young.")
       else if(age >= 13 && age< 18)  println("You are a teenager.")
       else println("You are old.")
    }

    def yearPasses(): Unit = {
        age = age + 1
    }  

}
