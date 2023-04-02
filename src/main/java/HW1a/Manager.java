package HW1a;

public class Manager extends BaseManager{

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalaryManager() {
        if (getNumberOfSubordinates() > 0) {
            return (int) (getSalaryWorker() * (getNumberOfSubordinates() / 100.0 * 3));
        } else {
            return getSalaryWorker();
        }

    }
}
