package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        } else return false;
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return defaultPrice() * 2;
        } else return defaultPrice();
    }
}
