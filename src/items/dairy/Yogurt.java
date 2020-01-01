package items.dairy;

import items.Produce;

public class Yogurt extends Produce {
    public Yogurt(int quantity) {
        super("Yogurt", quantity, 0.40);
    }

    @Override
    public void description() {
        System.out.println(" is a food produced by bacterial fermentation of milk.");
    }
}
