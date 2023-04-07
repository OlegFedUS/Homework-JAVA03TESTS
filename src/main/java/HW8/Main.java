package HW8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker("Kazua", 4000);
        Manager manager = new Manager("Billy", 6000, 10);
        Director director = new Director("Van", 1000, 5);

        //Создание списка массиво за счет Наследования.
        Worker[] workers = {worker, manager, director};
        BaseManager[] managers = {manager, director};

        System.out.println(EmployeeUtils.minManagersSalary(managers));
        System.out.println(EmployeeUtils.maxManagersSalary(managers));

        System.out.println();

        //Замещение в массиве
        Director[] directors = {new Director("Gachibass", 4444, 10)};
        int[] numArr = new int[workers.length];
        for (int i = 0; i < workers.length; i++){
            numArr[i] = workers[i].getSalary();
        }
        System.out.println(Arrays.toString(numArr));





    }
}
