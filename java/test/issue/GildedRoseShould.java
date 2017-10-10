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
        Item thing = new Item("thing", 20, 20);

        Item[] items = new Item[1];
        items[0] = thing;
        GildedRoseSwitch gildedRoseSwitch = new GildedRoseSwitch(items);
        gildedRoseSwitch.updateQuality();
        assertThat(thing.getSellIn(), is(19));
    }
}
