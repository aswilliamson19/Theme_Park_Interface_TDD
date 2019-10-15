package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
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
        Visitor visitor1 = new Visitor(13, 120, 20);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void acceptsVisitorOver15() {
        Visitor visitor2 = new Visitor(23, 250, 100);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }
}
