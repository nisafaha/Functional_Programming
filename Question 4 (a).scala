//Question 4 (a)
object salary{
    def main(args: Array[String]) = {
        def wage(h1:Int):Int = h1*250
        def OT(h2:Int):Int = h2*85
        def Income(h1:Int, h2:Int):Int = wage(h1) + OT(h2)
        def Tax(h1:Int, h2:Int):Double = Income(h1, h2)*.12
        def salary(h1:Int, h2:Int):Double = Income(h1, h2) - Tax(h1, h2)

        print(salary(250,85))
    }
}