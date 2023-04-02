package HW1a;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1Test2 {

    @Test
    public void HW8aTEST2(){

        Company company = new Company();

        Employee[] employees2 = {new Employee("Billy", 7777)};

        int num = company.maxSalary(employees2);

        Assert.assertEquals(7777, num);

    }
}
