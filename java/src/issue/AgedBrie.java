package issue;

public class AgedBrie extends Item{

    AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if(getSellIn() >= 0){
            if(getQuality() < 50) {setQuality(getQuality() + 1);}
        }else{
            super.updateQuality();
        }
    }
}
