class NewYorkCoffeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double, bisquitsPrice: Double):
    CoffeShop(americanoPrice,cappuccinoPrice,lattePrice, bisquitsPrice) {
    override fun makeAmericano() {
        americanoCount++
        println("New York Americano is ready!")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("New York Cappuccino is ready!")
    }

    override fun makeLatte() {
        latteCount++
        println("New York Latte is ready!")
    }

    override fun giveBiscuit() {
        println("Here are your biscuit, hot as New York policeman!")
    }
}