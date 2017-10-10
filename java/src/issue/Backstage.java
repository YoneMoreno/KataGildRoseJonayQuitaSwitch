package issue;

public class Backstage extends Item {

    Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        setSellIn(getSellIn() - 1);

        if (getSellIn() <= 0) {
            setQuality(0);
        } else {
            if (getSellIn() <= 5) {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 3);
                }
            } else if (getSellIn() <= 10) {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 2);
                }
            }
        }
    }
}
