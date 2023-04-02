package HW1a;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1Test {

    @Test
    public void HW8aTEST(){

        Company company = new Company();

        Employee[] employees1 = {new Employee("Van", 6969)};

        String str = "" + company.findName("Van", employees1);

        Assert.assertEquals(str, "1");



    }
}
