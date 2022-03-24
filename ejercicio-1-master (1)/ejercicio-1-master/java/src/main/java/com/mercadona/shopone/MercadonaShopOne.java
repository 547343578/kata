package com.mercadona.shopone;

import com.mercadona.shopone.utils.Utils;
import com.mercadona.shopone.utils.UtilsApi;

public class MercadonaShopOne {
    Item[] items;
    UtilsApi utils = new Utils();
    public MercadonaShopOne(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            boolean isHam = item.name.equals("Ham");
            boolean isCheese = item.name.equals("Aged blue cheese");
            boolean isIodizedSalt = item.name.equals("Iodized salt");
            boolean isFrozen = item.name.equals("frozen");
            if(isHam){
                utils.calculateHamQuality(item);
            }else if(isCheese){
                utils.calculateCheeseQuality(item);
            }else if(isFrozen){
                utils.calculateFrozenQuality(item);
            }else if(isIodizedSalt){
                utils.calculateIodizedQuality(item);
            }else{
                utils.calculateGenericQuality(item);
            }
        }
    }
}