import MercadonaShopOne

let items = [
    Item(name: "Bread", sellIn: 10, quality: 20),
    Item(name: "Aged blue cheese", sellIn: 2, quality: 0),
    Item(name: "Yogurt", sellIn: 5, quality: 7),
    Item(name: "Iodized salt", sellIn: 0, quality: 80),
    Item(name: "Iodized salt", sellIn: -1, quality: 80),
    Item(name: "Ham", sellIn: 15, quality: 20),
    Item(name: "Ham", sellIn: 10, quality: 49),
    Item(name: "Ham", sellIn: 5, quality: 49),
    // this conjured item does not work properly yet
    Item(name: "Frozen cake", sellIn: 3, quality: 6)]

let app = MercadonaShopOne(items: items);

var days = 2;
if CommandLine.argc > 1 {
    days = Int(CommandLine.arguments[1])! + 1
}

for i in 0..<days {
    print("-------- day \(i) --------");
    print("name, sellIn, quality");
    for item in items {
        print(item);
    }
    print("");
    app.updateQuality();
}
