import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BBQBeconBurger BBQBeconBurger = new BBQBeconBurger();
        Cheesburger Cheesburger = new Cheesburger();
        DiabloBurger DiabloBurger = new DiabloBurger();
        BrocoliBurger BrocoliBurger = new BrocoliBurger();


        Random rand = new Random();

        int profit = 0;
        int workHours = 480;
        int hour = 0;

        Waiter waiter = new Waiter(10 * workHours, workHours);
        Cook cook = new Cook( 20 * workHours, workHours);

        while (hour < workHours) {

            int randomPizza = rand.nextInt(7) + 1;
            int randomIsWithSomeone = rand.nextInt(2)+1;
            int randomAmountOfPeople = 1;
            if (randomIsWithSomeone == 2) {
                randomAmountOfPeople = rand.nextInt(8)+1;
            }
            int randomTimeTakeWaiter = rand.nextInt(20) + 1;
            hour += randomTimeTakeWaiter;
            if (randomTimeTakeWaiter >= 20) {
                System.out.println("Waiter took too long so the customers left");
                System.out.println(randomTimeTakeWaiter + " minutes waisted");
            } else {
                switch (randomPizza) {
                    case 1:
                        System.out.println("The customer ordered " + randomAmountOfPeople + " BBQBeconBurger");
                        BBQBeconBurger.makeBurger();
                        System.out.println("The check price was: " + BBQBeconBurger.getPrice() * randomAmountOfPeople);
                        profit += BBQBeconBurger.getPrice() * randomAmountOfPeople;
                        break;
                    case 2:
                        System.out.println("The customer ordered " + randomAmountOfPeople + " Cheesburger ");
                        Cheesburger.makeBurger();
                        System.out.println("The check price was: " + Cheesburger.getPrice() * randomAmountOfPeople);
                        profit += Cheesburger.getPrice() * randomAmountOfPeople;
                        break;
                    case 3:
                        System.out.println("The customer ordered " + randomAmountOfPeople + " DiabloBurger ");
                        DiabloBurger.makeBurger();
                        System.out.println("The check price was: " + DiabloBurger.getPrice() * randomAmountOfPeople);
                        profit += DiabloBurger.getPrice() * randomAmountOfPeople;
                        break;
                    case 4:
                        System.out.println("The customer ordered " + randomAmountOfPeople + " BrocoliBurger ");
                        BrocoliBurger.makeBurger();
                        System.out.println("The check price was: " + BrocoliBurger.getPrice() * randomAmountOfPeople);
                        profit += BrocoliBurger.getPrice() * randomAmountOfPeople;
                        break;

                }
                hour += 15 * (randomAmountOfPeople / 2) + (randomAmountOfPeople % 2);
            }
            System.out.println("    ");
        }
        System.out.println("Work day ended");
        System.out.println("The waiter was payed " + waiter.getSalary() + " and the cook " + cook.getSalary());
        profit -= waiter.getSalary() + cook.getSalary();
        System.out.println("Final profit : " + profit);
    }
}