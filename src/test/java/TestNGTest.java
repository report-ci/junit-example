import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


@Test()
public class TestNGTest {

    @Test
    public void e1()
    {
        Assert.assertTrue(false);
    }

    @Test
    public void e2()
    {
        Reporter.log("Method name is e2");
        Assert.assertTrue(true);
    }

}
