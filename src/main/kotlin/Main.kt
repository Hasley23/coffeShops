import kotlin.system.exitProcess

val coffeShop = MoscowCoffeShop(100.5, 130.8, 200.2,50.4)
val coffeShop1 = NewYorkCoffeShop(201.0, 261.6, 400.4, 150.5)
lateinit var coffeShopOfficial : CoffeShop

fun main() {
    println("Hello, choose a city please:\nMoscow | New York | Exit")
    var choice = readln() // text input
    var location = 0 // location var
    var coffeType = 0 // coffe type var

    // location recognition
    location = when(choice){
        "Moscow" -> 1
        "New York" -> 2
        "Exit" -> {
            println("Goodbye!")
            return
        }
        else -> {println("Error!")
            exitProcess(1)}
    }

    println("Choose coffe please:\nAmericano | Cappuccino | Latte")
    choice = readln()

    // coffe type recognition
    coffeType = when(choice){
        "Americano" -> 1
        "Cappuccino" -> 2
        "Latte" -> 3
        else -> {println("Error!")
            exitProcess(1)}
    }

    // true coffe shop creation
    coffeShopOfficial = when(location){
        1 -> coffeShop
        2 -> coffeShop1
        else -> {println("Error!")
            exitProcess(1)
        }
    }

    println("Would you like to see statistics? (yes | no)")
    val statChoice = when(readln()){
        "yes" -> coffeShopOfficial.showStats()
        "no" -> println("Ok! As you wish!")
        else -> {println("Error!")
            exitProcess(1)
        }
    }

    // additional question
    println("Would you like biscuits? (yes | no)")
    var biscuitsBool = false
    when(readln()){
        "yes" -> biscuitsBool = true
        "no" -> println("Ok, as you say!")
        else -> println("We aren't understand you!")
    }

    if (biscuitsBool){
        coffeShopOfficial.giveBiscuit()
    }

    // cook coffe
    when(coffeType) {
        1 -> coffeShopOfficial.makeAmericano()
        2 -> coffeShopOfficial.makeCappuccino()
        3 -> coffeShopOfficial.makeLatte()
        else -> {
            println("Error!")
            exitProcess(1)
        }
    }
}