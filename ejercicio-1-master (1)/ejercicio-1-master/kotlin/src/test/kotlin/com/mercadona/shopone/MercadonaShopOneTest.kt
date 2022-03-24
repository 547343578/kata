package com.mercadona.shopone

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MercadonaShopOneTest {

    @Test
    fun foo() {
        val items = arrayOf<Item>(Item("foo", 0, 0))
        val app = MercadonaShopOne(items)
        app.updateQuality()
        assertEquals("fixme", app.items[0].name)

    }

}


