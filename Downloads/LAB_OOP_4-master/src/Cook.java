
public class Cook  extends Employee implements ICook{

    public Cook(int salary, int shift) {
        super("cook", salary, shift);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void iamcook() {
        System.out.println("I am cook");
    }
}
