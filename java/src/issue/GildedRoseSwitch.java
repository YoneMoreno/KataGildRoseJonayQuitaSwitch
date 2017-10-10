package issue;

class GildedRoseSwitch {
    private Item[] items;

    GildedRoseSwitch(Item[] items) {
        this.items = items;
    }

    void updateQuality() {
        for (Item item : items) {
            item.updateQuality();
            item.setSellIn(item.getSellIn() - 1);
        }
    }

}
