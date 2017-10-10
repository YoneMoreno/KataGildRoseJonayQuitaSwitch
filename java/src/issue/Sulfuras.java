package issue;

public class Sulfuras extends Item {
    Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if(getQuality() != 80){
            setQuality(80);
        }
        setSellIn(getSellIn()-1);
    }
}