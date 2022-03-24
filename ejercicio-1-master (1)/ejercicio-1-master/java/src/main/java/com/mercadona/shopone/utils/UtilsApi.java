package com.mercadona.shopone.utils;

import com.mercadona.shopone.Item;

public interface UtilsApi {
    void calculateGenericQuality(Item item);
    void calculateHamQuality(Item item);
    void calculateCheeseQuality(Item item);
    void calculateIodizedQuality(Item item);
    void calculateFrozenQuality(Item item);
    void decrementSellIn(Item item);
    Boolean isQualityUnderLimited(Item item);
}
