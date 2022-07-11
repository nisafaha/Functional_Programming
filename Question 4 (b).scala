//Question 4 (b)
val costForEachPerformance = 500.00f
val costForEachAttendant = 3.00f
val basePrice = 15.00f
val priceChange = 5

def max(a: Float, b: Float): Float = if(a >= b) a else b
def PeopleCount(priceChange: Int): Int = -1 * (priceChange * 20 / 5) + 120
def TicketPrice(priceChange: Int): Float = basePrice + priceChange
def Income(NumberOfPeople: Int, ticketprice: Int): Float = ticketprice * NumberOfPeople
def cost(NumberOfPeople: Int): Float = costForEachPerformance + (costForEachAttendant * NumberOfPeople)
def profit(Income: Float, Cost: Float): Float = Income - Cost
def CalculatingProfit(NumberOfPeople: Int, ticketprice: Float): Float = profit(Income(NumberOfPeople, ticketprice), cost(NumberOfPeople))

def BestPrice(increacedPrice: Int, decreasePrice: Int): Float = {
    val Increased_NumberOfPeople = PeopleCount(increacedPrice)
    val Increased_ticketPrice = TicketPrice(increasedPrice)
    val increased_profit = CalculatingProfit(Increased_NumberOfPeople, Increased_ticketPrice)

    val Decreased_NumberOfPeople = PeopleCount(decreasePrice)
    val Decreased_ticketPrice = TicketPrice(decreasePrice)
    val decreased_profit = CalculatingProfit(Decreased_NumberOfPeople, Decreased_ticketPrice) 

    if(increased_profit >= decreased_profit) Increased_ticketPrice else Decreased_ticketPrice
}

object variables extends App{
    def main(args: Array[String])={
        BestPrice(8, -7)
    }
}