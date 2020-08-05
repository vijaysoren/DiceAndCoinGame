fun main() {
    val firstDice = Dice(6, "Red") // Dice 1
    println("A ${firstDice.numSides} sided ${firstDice.diceColor()} dice rolled a : ${firstDice.roll()}")

    val secondDice = Dice(20, "Green") //Dice 2
    println("A ${secondDice.numSides} sided ${secondDice.diceColor()} dice rolled a : ${secondDice.roll()}")

    if(Coin().tossNum == 1){ //access random number from Coin class and decide head or tail
        println("The coin tossed and it is : Head")
    }else{
        println("The coin tossed and it is : Tail")
    }
}

class Dice (val numSides : Int, private val color : String) {
    fun roll (): Int{
        return (1..numSides).random()
    }
    fun diceColor ():String{
        return color
    }
}

class Coin {
    val tossNum = (1..2).random() // generate random number between 1 and 2
}