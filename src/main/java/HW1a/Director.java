package HW1a;

public class Director extends BaseManager {

    public Director(String name, int baseSalary, int numberOfSubordinates){
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalaryDirector() {
        if (getNumberOfSubordinates() > 0) {
            return (int) (getSalaryWorker() * (getNumberOfSubordinates() / 100.0 * 9));
        } else {
            return getSalaryWorker();
        }

    }
}
