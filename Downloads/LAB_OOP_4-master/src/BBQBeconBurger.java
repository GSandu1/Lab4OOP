
public class BBQBeconBurger extends Meat {

    private int gramsOfBacon;
    private int gramsOfBBQBeconBurgerSouse;

    public BBQBeconBurger() {
        super("normal", 50, 70, 160, true);
        this.gramsOfBacon = 80;
        this.gramsOfBBQBeconBurgerSouse = 30;
    }

    @Override
    public void makeBurger() {
        super.makeBurger();
        System.out.println("In the end the cook added " + gramsOfBacon + " grams of bacon and " + gramsOfBBQBeconBurgerSouse + " grams of BBQ souse");
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (gramsOfBacon * 4 + gramsOfBBQBeconBurgerSouse * 0.75);
    }
}