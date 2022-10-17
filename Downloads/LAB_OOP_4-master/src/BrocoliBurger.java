
public class BrocoliBurger extends Vegies {
    private int gramsOfBrocoli;
    private int gramsOfProvalone;

    public BrocoliBurger() {
        super("normal", 25, 75, 50, false);
        this.gramsOfBrocoli = 100;
        this.gramsOfProvalone = 125;
    }

    @Override
    public void makeBurger() {
        super.makeBurger();
        System.out.println("In the end the cook added " + gramsOfBrocoli + " grams of tomato souse and "
                + gramsOfProvalone + " grams of provalone");
    }

    @Override
    public double getPrice() {
        return super.getPrice() + gramsOfBrocoli * 0.4 + gramsOfProvalone * 1.2;
    }
}