package com.mercadona.shopone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MercadonaShopOneTest {

    @Test
    void nameAndSellInTest(){
        Item[] items = new Item[] {
                new Item("Bread", 10, 10),
                new Item("Aged blue cheese", 10, 10),
                new Item("Iodized salt", 10, 80),
                new Item("Ham", 20, 10),
                new Item("frozen", 10, 10),
        };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Bread", app.items[0].name);
        assertEquals("Aged blue cheese", app.items[1].name);
        assertEquals("Iodized salt", app.items[2].name);
        assertEquals("Ham", app.items[3].name);
        assertEquals("frozen", app.items[4].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(9, app.items[1].sellIn);
        assertEquals(10, app.items[2].sellIn);
        assertEquals(19, app.items[3].sellIn);
        assertEquals(9, app.items[4].sellIn);
    }

    @Test
    void basicNoExpiredTest() {
        Item[] items = new Item[] {
                new Item("Bread", 10, 10),
                new Item("Aged blue cheese", 10, 10),
                new Item("Iodized salt", 10, 80),
                new Item("Ham", 20, 10),
                new Item("frozen", 10, 10),
        };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals(9, app.items[0].quality);
        assertEquals(11, app.items[1].quality);
        assertEquals(80, app.items[2].quality);
        assertEquals(11, app.items[3].quality);
        assertEquals(8, app.items[4].quality);
    }

    @Test
    void basicExpiredTest(){
        Item[] items = new Item[] {
                new Item("Bread", 0, 10),
                new Item("Aged blue cheese", 0, 10),
                new Item("Iodized salt", 0, 80),
                new Item("Ham", 0, 10),
                new Item("frozen", 0, 10),
        };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
        assertEquals(12, app.items[1].quality);
        assertEquals(80, app.items[2].quality);
        assertEquals(0, app.items[3].quality);
        assertEquals(6, app.items[4].quality);
    }

    @Test
    void qualityUnderTest(){
        Item[] items = new Item[] {
                new Item("Bread", 0, 0),
                new Item("Aged blue cheese", 10, 50),
                new Item("Iodized salt", 0, 80),
                new Item("Ham", 5, 50)
                //    new Item("frozen", 10, 10),
        };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
        assertEquals(50, app.items[1].quality);
        assertEquals(80, app.items[2].quality);
        assertEquals(50, app.items[3].quality);
    }

    @Test
    void specificNotExpiredTest(){
        Item[] items = new Item[] {
                new Item("Ham", 6, 10)
                //    new Item("frozen", 10, 10),
        };
        MercadonaShopOne app = new MercadonaShopOne(items);

        // expiration date < 10 days
        app.updateQuality();
        assertEquals(12, app.items[0].quality);
        // expiration date < 5 days
        app.updateQuality();
        assertEquals(15, app.items[0].quality);
    }

}
