package HW1a;

import HW8.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1Test {

    @Test
    public void HW8aTEST(){

        Manager manager = new Manager("Phillip", 2000, 10);
        Director director = new Director("Tony", 5000, 5);
        BaseManager[] people = {manager, director};

        int maxSalary =  EmployeeUtils.maxManagersSalary(people);
        Assert.assertEquals(maxSalary, 2250);

        Boolean findName  = EmployeeUtils.findName("Alexander", people);
        Assert.assertFalse(findName);
        Boolean findSubName = EmployeeUtils.findSubName("Phill", people);
        Assert.assertTrue(findSubName);

        int minSubordinates = EmployeeUtils.minNumberOfSubordinates(people);
        Assert.assertEquals(minSubordinates, 5);

    }
}
