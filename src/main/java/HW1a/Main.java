package HW1a;

public class Main {

    public static void main(String[] args) {


        Manager manager = new Manager("Vachtang Dudaev", 14000, 3000);
        System.out.println(" Manager Name: " + manager.getName() + "\n " + "Total Salary: " + manager.getSalaryManager());

        System.out.println();

        Director director = new Director("Mambek Magametov", 14000, 3000);
        System.out.println(" SEO Name: " + director.getName() + "\n " + "Total Salary: " + director.getSalaryDirector());

        System.out.println();

        Employee[] employees = {new Employee("Ivan Pizdorvan", 1000)};

        Director[] directors = {new Director("Gatilla", 6666, 1488)};

        Company company = new Company();
        System.out.println(company.findName("Eblan Pizdorvan", employees));
        System.out.println(company.findName("Gatilla", directors));

        System.out.println(company.maxSalary(directors));


        System.out.println(company.totalSalary(directors));

    }
}
