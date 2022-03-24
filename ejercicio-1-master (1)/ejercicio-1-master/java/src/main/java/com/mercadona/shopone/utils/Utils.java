package com.mercadona.shopone.utils;

import com.mercadona.shopone.Item;

public class Utils implements UtilsApi{
    public void calculateGenericQuality(Item item){
        if(item.sellIn >= 0) {
            item.quality--;
        }
        decrementSellIn(item);
        if(item.sellIn < 0){
            item.quality--;
            if(item.quality < 0) item.quality = 0;
        }
    }

    public Boolean isQualityUnderLimited(Item item){
        return item.quality < 50;
    }

    public void calculateHamQuality(Item item){
        if(isQualityUnderLimited(item)){
            item.quality += 1;
            if(item.sellIn < 11 && isQualityUnderLimited(item)){
                item.quality += 1;
                if(item.sellIn < 6 && isQualityUnderLimited(item)){
                    item.quality += 1;
                }
            }
        }
        decrementSellIn(item);
        if (item.sellIn < 0){
            item.quality = 0;
        }
    }

    public void calculateCheeseQuality(Item item){
        if(isQualityUnderLimited(item)) {
            item.quality += 1;
        }
        decrementSellIn(item);
        if(item.sellIn < 0 && isQualityUnderLimited(item)){
            item.quality += 1;
        }
    }

    public void calculateIodizedQuality(Item item){

    }

    public void calculateFrozenQuality(Item item){
        if(item.sellIn >= 0) {
            item.quality -= 2;
        }
        decrementSellIn(item);
        if(item.sellIn < 0){
            item.quality -= 2;
            if(item.quality < 0) item.quality = 0;
        }
    }


    public void decrementSellIn(Item item){
        item.sellIn --;
    }
}
