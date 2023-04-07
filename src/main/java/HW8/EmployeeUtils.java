package HW8;

public class EmployeeUtils {

    public static Boolean findName(String name, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName())) {
                return true;
            }
        } return false;

    }

    public static Boolean findSubName(String name, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(name)) {
                return true;
            }
        } return false;
    }

    public static int sumOfSalary(Worker[] workers){
        int sum = 0;
        for (int i = 0; i < workers.length; i++){
            sum += workers[i].getBaseSalary();
        }
        return sum;
    }

    public static int minSalary(Worker[] workers){
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < workers.length; i++){
            if (sum > workers[i].getSalary()){
                sum = workers[i].getSalary();
            }
        }
        return sum;
    }

    public static int maxSalary(Worker[] workers){
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < workers.length; i++){
            if (sum < workers[i].getSalary()){
                sum = workers[i].getSalary();
            }
        }
        return sum;
    }

    public static int minNumberOfSubordinates(BaseManager[] baseManagers){
        int number = Integer.MAX_VALUE;
        for (int i = 0; i < baseManagers.length; i++){
            if (number > baseManagers[i].getNumberOfSubordinates()){
                number = baseManagers[i].getNumberOfSubordinates();
            }
        }
        return number;
    }

    public static int maxNumberOfSubordinates(BaseManager[] baseManagers){
        int number = Integer.MIN_VALUE;
        for (int i = 0; i < baseManagers.length; i++){
            if (number < baseManagers[i].getNumberOfSubordinates()){
                number = baseManagers[i].getNumberOfSubordinates();
            }
        }
        return number;
    }

    public static int minManagersSalary(BaseManager[] baseManagers){
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < baseManagers.length; i++){
            if (sum > baseManagers[i].getSalary()){
                sum = baseManagers[i].getSalary();
            }
        }
        return sum;
    }

    public static int maxManagersSalary(BaseManager[] baseManagers){
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < baseManagers.length; i++){
            if (sum < baseManagers[i].getSalary()){
                sum = baseManagers[i].getSalary();
            }
        }
        return sum;
    }

}


