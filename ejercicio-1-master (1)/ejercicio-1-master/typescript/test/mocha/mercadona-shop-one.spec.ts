import { expect } from 'chai';
import { Item, MercadonaShopOne } from '@/mercadona-shop-one';

describe('MercadonaShopOne', () => {
  it('should foo', () => {
    const mercadonaShopOne = new MercadonaShopOne([new Item('foo', 0, 0)]);
    const items = mercadonaShopOne.updateQuality();
    expect(items[0].name).to.equal('fixme');
  });
});
