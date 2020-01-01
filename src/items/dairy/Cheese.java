package items.dairy;

import items.Produce;

public class Cheese extends Produce {
    public Cheese(int quantity) {
        super("Cheese", quantity, 0.09);
    }

    @Override
    public void description() {
        System.out.println("the round fruit of a tree of the rose family, " +
                "which typically has thin red or green skin and crisp flesh. " +
                "Many varieties have been developed as dessert or cooking fruit " +
                "or for making cider");
    }
}
