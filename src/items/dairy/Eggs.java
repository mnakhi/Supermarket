package items.dairy;

import items.Produce;

public class Eggs extends Produce {
    public Eggs(int quantity) {
        super("Eggs", quantity, 0.15);
    }
    @Override
    public void description() {
        System.out.println("Eggs contain several vitamins and minerals that are essential parts of a healthful diet");
    }
}
