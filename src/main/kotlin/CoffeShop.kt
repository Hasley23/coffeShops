abstract class CoffeShop(val americanoPrice: Double, val cappuccinoPrice: Double, val lattePrice: Double, val biscuitsPrice: Double) : Biscuitable {
    var americanoCount = 0
    var cappuccinoCount = 0
    var latteCount = 0
    var biscuitsCount = 0

    abstract fun makeAmericano()
    abstract fun makeCappuccino()
    abstract fun makeLatte()

    open fun showStats(){
        println("Americano count: $americanoCount\n" +
                "Cappuccino count: $cappuccinoCount\n" +
                "Latte count: $latteCount\n" +
                "Biscuits count: $biscuitsCount")
        val money = americanoCount*americanoPrice+cappuccinoCount*cappuccinoPrice+latteCount*lattePrice+biscuitsCount*biscuitsPrice
        println("Money earned: $money")
    }
}