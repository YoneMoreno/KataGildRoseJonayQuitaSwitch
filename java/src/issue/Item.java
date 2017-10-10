package issue;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality(){
        updateQualityItem();
    }

    public void updateQualityItem() {
        if(quality > 0){
            if(sellIn <= 0){
                setQuality(getQuality()-2);
            }else{setQuality(getQuality()-1);}
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    String getName() {
        return name;
    }

    int getSellIn() {
        return sellIn;
    }

    void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    int getQuality() {
        return quality;
    }

    void setQuality(int quality) {
        this.quality = quality;
    }
}