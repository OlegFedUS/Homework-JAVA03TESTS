package HW1;

import org.asynchttpclient.util.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1Test {


    @Test
    public void Task1Test(){

        Task1 task1 = new Task1();
        task1.setAge(69);
        String ageTest = task1.getAge();
        Assert.assertEquals(ageTest, "Legal age");

    }

    @Test
    public void Task1Test2(){

        Task1 task1 = new Task1();
        task1.setName("Van");
        String nameTest = task1.getName();
        Assert.assertEquals(nameTest, "Billy");

    }

}
