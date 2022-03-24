@testable import MercadonaShopOne
import XCTest

class MercadonaShopOneTests: XCTestCase {

    func testFoo() throws {
        let items = [Item(name: "foo", sellIn: 0, quality: 0)]
        let app = MercadonaShopOne(items: items)
        app.updateQuality()
        XCTAssertEqual(app.items[0].name, "fixme")
    }
}
