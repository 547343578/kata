import sys

from mercadona_shop_one import *

if __name__ == "__main__":

    print("Welcome to Mercadona Shop One!")
    items = [
        Item(name="Bread", sell_in=10, quality=20),
        Item(name="Aged blue cheese", sell_in=2, quality=0),
        Item(name="Yogurt", sell_in=5, quality=7),
        Item(name="Iodized salt", sell_in=0, quality=80),
        Item(name="Iodized salt", sell_in=-1, quality=80),
        Item(name="Ham", sell_in=15, quality=20),
        Item(name="Ham", sell_in=10, quality=49),
        Item(name="Ham", sell_in=5, quality=49),

        # this Frozen item does not work properly yet
        Item(name="Frozen cake", sell_in=3, quality=6),  # <-- :O
    ]

    days = 2

    if len(sys.argv) > 1:
        days = int(sys.argv[1]) + 1
    for day in range(days):
        print("-------- day %s --------" % day)
        print("name, sellIn, quality")
        for item in items:
            print(item)
        print("")
        MercadonaShopOne(items).update_quality()
