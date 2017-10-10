package issue;

public class Backstage extends Item {

    Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decrementSellIn();

        if (getSellIn() <= 0) {
            setQuality(0);
        } else if (getSellIn() <= 5) {
            super.incrementQuality(3);
        } else if (getSellIn() <= 10) {
            super.incrementQuality(2);
        }
    }
}
