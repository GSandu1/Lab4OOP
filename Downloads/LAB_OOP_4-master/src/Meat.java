
public class Meat extends Bun {
    protected int chicken;
    private boolean sausage;


    public Meat(String eggType, int number, int amountOfSouse, int chicken, boolean sausage) {
        super(eggType, number, amountOfSouse);
        this.chicken = chicken;
        this.sausage = sausage;
    }


    @Override
    public void makeBurger() {
        super.makeBurger();
        if(sausage){
            System.out.println("After, the cook added " + chicken + " grams of chicken and sausages ");
        } else {
            System.out.println("After, the cook added " + chicken + " grams of chicken ");
        }
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (chicken * 2.5);
    }
}