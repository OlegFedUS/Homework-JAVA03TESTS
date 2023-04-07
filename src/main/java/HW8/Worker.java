package HW8;

public class Worker extends Employee {



    public Worker(String name, int baseSalary){
        super(name, baseSalary);
    }


    public int getSalary(){
        return getBaseSalary();
    }



}
