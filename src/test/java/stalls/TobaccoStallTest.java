package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorMustBeOver15() {
        Visitor visitor1 = new Visitor(13, 150, 20);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void acceptsVisitorOver15() {
        Visitor visitor2 = new Visitor(23, 250, 100);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }
}
