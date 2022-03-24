package com.mercadona.shopone

fun main(args: Array<String>) {

    println("OMGHAI!")

    val items = arrayOf(Item("Bread", 10, 20), //
            Item("Aged blue cheese", 2, 0), //
            Item("Yogurt", 5, 7), //
            Item("Iodized salt", 0, 80), //
            Item("Iodized salt", -1, 80),
            Item("Ham", 15, 20),
            Item("Ham", 10, 49),
            Item("Ham", 5, 49),
            // this conjured item does not work properly yet
            Item("Frozen cake", 3, 6))

    val app = MercadonaShopOne(items)

    var days = 2
    if (args.size > 0) {
        days = Integer.parseInt(args[0]) + 1
    }

    for (i in 0..days - 1) {
        println("-------- day $i --------")
        println("name, sellIn, quality")
        for (item in items) {
            println(item)
        }
        println()
        app.updateQuality()
    }


}
