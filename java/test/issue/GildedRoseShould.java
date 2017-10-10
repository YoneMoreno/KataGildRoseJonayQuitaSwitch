package issue;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GildedRoseShould {

    @Test
    public void test() throws Exception {
        assertThat(true, is(true));
    }

    @Test
    public void given_decrement_sellIn() throws Exception {
        Item thing = new Item("Aged Brie", 20, 20);

        Item[] items = {thing};
        new GildedRoseSwitch(items).updateQuality();

        assertThat(thing.getSellIn(), is(19));
    }

    @Test
    public void given_decrement_quality() throws Exception {
        Item thing = new Item("thing", 20, 11);

        Item[] items = {thing};
        new GildedRoseSwitch(items).updateQuality();

        assertThat(thing.getQuality(), is(10));
    }

    @Test
    public void given_decrement_when_sellIn_expires_twice_fast_quality() throws Exception {
        Item thing = new Item("thing", 0, 10);

        Item[] items = {thing};
        new GildedRoseSwitch(items).updateQuality();

        assertThat(thing.getQuality(), is(8));
    }

    @Test
    public void quality_is_never_negative() throws Exception {
        Item thing = new Item("thing", 20, 0);

        Item[] items = {thing};
        new GildedRoseSwitch(items).updateQuality();

        assertThat(thing.getQuality(), is(0));
    }

    @Test
    public void aged_brie_when_is_older_increments_quality() throws Exception {
        Item thing = new Item("Aged Brie", 20, 0);

        Item[] items = {thing};
        new GildedRoseSwitch(items).updateQuality();

        assertThat(thing.getQuality(), is(1));


    }

}
