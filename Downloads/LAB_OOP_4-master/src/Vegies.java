
public class Vegies extends Bun {

    private int tomatoes;
    private boolean onions;

    public Vegies(String eggType, int number, int amountOfSouse, int tomatoes, boolean onions) {
        super(eggType, number, amountOfSouse);
        this.tomatoes = tomatoes;
        this.onions = onions;
    }


    @Override
    public void makeBurger() {
        super.makeBurger();
        if (onions) {
            System.out.println("After, the cook added " + tomatoes + " grams of tomatoes and onions on burger");
        } else {
            System.out.println("After, the cook added " + tomatoes + " grams of tomatoes ");
        }
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (tomatoes * 0.3);
    }
}