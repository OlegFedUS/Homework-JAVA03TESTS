package HW1StringUtils;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstHwTest {

    String str = "this text purpose is StringUtils practice";
    @Test
    public void firstTest(){


        int numberOfChar = StringUtils.length(str);
        Assert.assertEquals(numberOfChar, 41);

        Assert.assertEquals(StringUtils.capitalize(str), "This text purpose is StringUtils practice");
        System.out.println(StringUtils.deleteWhitespace(str));
        Assert.assertEquals(str, "this text purpose is StringUtils practice");


    }
}
