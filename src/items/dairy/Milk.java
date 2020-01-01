package items.dairy;

import items.Produce;

public class Milk extends Produce {
    public Milk(int quantity){
        super("Milk",quantity,1.99);
    }

    @Override
    public void description() {
        System.out.println("Milk is a nutrient-rich, white liquid food.");
    }
}
