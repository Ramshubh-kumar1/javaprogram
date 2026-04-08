
package maypackheritance;

import maypackheritance.Vechicle;

public class TwoWheeler extends Vechicle{
    public TwoWheeler() {
        setNumberOfTires(2);
        numberOfTires = 4;
    }

    public void balance() {
        System.out.println("I am balancing on two tires");
    }
}
