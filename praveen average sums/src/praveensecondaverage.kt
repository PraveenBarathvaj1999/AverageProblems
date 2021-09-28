fun main(args:Array<String>){
    var houseBudjet = 5000000
    var cementPrice = 1500
    var cementQuantity = cementPrice*100
    var sand = 12000
    var labourCharge = 10000
    var totalDays = 90
    var reducedWeekend = totalDays-12
    var transportFee = 3000
    var homeAppliances = 1000000
    var function = 300000
    var trip = 50000
    var dogs = 10000
    var treat = 10000
    var unexpectedExpense = 100000
    var total = cementQuantity+sand+labourCharge+reducedWeekend+transportFee+homeAppliances+function+trip+dogs+treat+unexpectedExpense
    println("houseBudjet  "+total)
    var average = total/houseBudjet
    println("praveen   "+average)
}