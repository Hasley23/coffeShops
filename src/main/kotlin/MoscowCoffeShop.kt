class MoscowCoffeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double, bisquitsPrice: Double):
    CoffeShop(americanoPrice,cappuccinoPrice,lattePrice, bisquitsPrice) {
    override fun makeAmericano() {
        americanoCount++
        println("Moscow Americano is ready!")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Moscow Cappuccino is ready!")
    }

    override fun makeLatte() {
        latteCount++
        println("Moscow Latte is ready!")
    }

    override fun giveBiscuit() {
        println("Here are your biscuit, from Russia with love!")
    }
}