import unittest

from mercadona_shop_one import Item, MercadonaShopOne


class MercadonaShopOneTest(unittest.TestCase):
    def test_foo(self):
        items = [Item("foo", 0, 0)]
        mercadonashopone = MercadonaShopOne(items)
        mercadonashopone.update_quality()
        self.assertEqual("fixme", items[0].name)


if __name__ == '__main__':
    unittest.main()
