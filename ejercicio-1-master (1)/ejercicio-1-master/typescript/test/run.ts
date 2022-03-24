import { Item, MercadonaShopOne } from '../app/mercadona-shop-one';

const items = [
  new Item("Bread", 10, 20), //
  new Item("Aged blue cheese", 2, 0), //
  new Item("Yogurt", 5, 7), //
  new Item("Iodized salt", 0, 80), //
  new Item("Iodized salt", -1, 80),
  new Item("Ham", 15, 20),
  new Item("Ham", 10, 49),
  new Item("Ham", 5, 49),
  // this conjured item does not work properly yet
  new Item("Frozen cake", 3, 6)];


const mercadonaShopOne = new MercadonaShopOne(items);
let days: number = 2;

if (process.argv.length > 2) {
  days = +process.argv[2];
}

for (let i = 0; i < days; i++) {
  console.log("-------- day " + i + " --------");
  console.log("name, sellIn, quality");
  items.forEach(element => {
    console.log(element.name + ' ' + element.sellIn + ' ' + element.quality);

  });
  console.log();
  mercadonaShopOne.updateQuality();
}
