import org.testng.Assert;
import org.testng.annotations.Test;

public class HW13_2Test {
    @Test
    public void testGetAbbreviationForTenChar() {
        String testString="Привет всем кто живет на луне!";
        int length = 10;
        String result = HW13_2.getAbbreviation(testString, length);
        Assert.assertEquals("Привет ...", result);
    }

    @Test
    public void testGetAbbreviationForTwentyChar() {
        String testString="Привет всем кто живет на луне!";
        int length = 20;
        String result = HW13_2.getAbbreviation(testString, length);
        Assert.assertEquals("Привет всем кто ж...", result);
    }

    /*
    @Test
    public void testGetAbbreviationForTenChar(){
        String ellipses = "...";
        String testString="Привет всем кто живет на луне!";
        int length = 10;
        String result = HW13_2.getAbbreviation(testString, length);
        String expectedResult = testString.substring(0, length-ellipses.length())+ellipses;
        Assert.assertEquals(result, expectedResult);
        Assert.assertTrue(result.length()==length);
    }

    @Test
    public void testGetAbbreviationForTwentyChar(){
        String ellipses = "...";
        String testString="Привет всем кто живет на луне!";
        int length = 20;
        String result = HW13_2.getAbbreviation(testString, length);
        String expectedResult = testString.substring(0, length-ellipses.length())+ellipses;
        Assert.assertEquals(result, expectedResult);
        Assert.assertTrue(result.length()==length);
    }
     */
}
