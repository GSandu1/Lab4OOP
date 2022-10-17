
public class Bun {

    private String buntype;
    private int size;
    private int amountOfSouse;

    private double price;

    public Bun(String buntype, int size, int amountOfSouse) {
        this.buntype = buntype;
        this.size = size;
        this.amountOfSouse = amountOfSouse;
    }

    public void setbuntype(String buntype) {
        this.buntype = buntype;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setAmountOfSouse(int amountOfSouse) {
        this.amountOfSouse = amountOfSouse;
    }

    public void makeBurger(){
        System.out.println("First, the cook makes a " + buntype + " bun that is " + size
                + " cm wide, and then he add" + amountOfSouse + " grams of souse on top of those cutted in a half buns.");
    }

    public double getPrice() {
        if (buntype == "normal") {
            price += 10;
        } else if (buntype == "GlutenFree") {
            price += 20;
        }
        price += size * 1.5;
        price += amountOfSouse * 0.5;
        return price;
    }
}