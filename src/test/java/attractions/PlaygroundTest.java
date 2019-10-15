package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorMustBeOver15() {
        Visitor visitor1 = new Visitor(13, 150, 20);
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void acceptsVisitorOver15() {
        Visitor visitor2 = new Visitor(23, 250, 100);
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
