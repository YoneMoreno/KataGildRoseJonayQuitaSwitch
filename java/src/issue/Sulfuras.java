package issue;

public class Sulfuras extends Item {
    Sulfuras( int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if(getQuality() != 80){
            setQuality(80);
        }
    }
}
