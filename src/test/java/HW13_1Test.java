import org.testng.Assert;
import org.testng.annotations.Test;

public class HW13_1Test {

    @Test
    public void testSum(){
        int sum = HW13_1.sum(-5, 5);
        Assert.assertEquals(sum, 0);
    }

    @Test
    public void testSubtraction(){
        int sub = HW13_1.subtraction(-5, 5);
        Assert.assertEquals(sub, -10);
    }

    @Test
    public void testMultiply(){
        int multiply = HW13_1.multiply(-5, 5);
        Assert.assertEquals(multiply, -25);
    }

    @Test
    public void testDivision(){
        int division = HW13_1.division(-5, 5);
        Assert.assertEquals(division, -1);
    }
}
