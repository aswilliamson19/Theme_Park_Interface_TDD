package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    private Dodgems dodgems;
    private Visitor visitor1;
    private Visitor visitor2;
    private double delta;

    @Before
    public void setUp(){
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(30, 200, 200);
        visitor2 = new Visitor(10, 100, 8);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canGetPriceForVisitor() {
        assertEquals(4.50, dodgems.priceFor(visitor1), delta);
        assertEquals(2.25, dodgems.priceFor(visitor2), delta);
    }
}
