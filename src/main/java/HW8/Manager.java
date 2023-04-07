package HW8;

public class Manager extends BaseManager {

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return (int) (super.getSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        }
    }


}
