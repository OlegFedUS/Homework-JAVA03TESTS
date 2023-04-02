package HW1a;

public class Worker extends Employee{

    public Worker(String name, int baseSalary){
        super(name, baseSalary);
    }

    public int getSalaryWorker(){
        return getBaseSalary();
    }

}
