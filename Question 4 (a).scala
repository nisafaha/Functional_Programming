//Question 4 (a)
var WorkingHourSalary = 250.0f
var OTsalary = 85.0f
var perWeekWorkingHour = 40
var OTWorkingHour = 30
var taxRate = 0.12f

def IsValid(WorkHour: Int, OTHour: Int): Boolean = workHour <= perWeekWorkingHour && OTHour <= perWeekWorkingHour
def TotalSalary(WorkHour: Int, OTHour: Int): Float = (WorkHour * WorkingHourSalary) + (OTHour * OTsalary)
def Tax(totalSalary: Float): Float = totalSalary * taxRate
def FinalSalary(totalSalary: Float, tax: Float): Float = totalSalary - tax

def CalculatingSalary(workHour: Int, OTHour: Int): Float = if(IsValid(workHour, OTHour)) {
    val totalSalary = TotalSalary(WorkHour, OTHour)
    val tax = Tax(totalSalary)
    FinalSalary(totalSalary, tax)
}else{
    0.0f
}

object variables extends App{
    def main(args: Array[String])={
        CalculatingSalary(45,35)
    }
}