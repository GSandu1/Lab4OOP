
public class Cheesburger extends Meat {

    private int gramsOfCheedar;
    private int gramsOfAmericanCheese;
    private int gramsOfProvalone;

    public Cheesburger() {
        super("normal", 35, 50, 100, false);
        this.gramsOfCheedar = 60;

        this.gramsOfAmericanCheese = 30;
        this.gramsOfProvalone = 100;
    }

    @Override
    public void makeBurger() {
        super.makeBurger();
        System.out.println("In the end the cook added " + gramsOfCheedar + " grams of cheedar, "
               + gramsOfAmericanCheese + " of American Cheese , " + gramsOfProvalone + " grams of Mozzarella cheese");
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (gramsOfProvalone * 1.2 + gramsOfCheedar * 0.3 + gramsOfAmericanCheese * 0.8);
    }
}