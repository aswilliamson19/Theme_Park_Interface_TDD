package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    private double delta;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(13, 120, 20);
        visitor2 = new Visitor(23, 250, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorMustBeOver15() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void acceptsVisitorOver15() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canGetDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), delta);
    }

    @Test
    public void canChangePriceForCertainGuests() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), delta);
    }
    
    
}
