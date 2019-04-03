import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MasterTest
{
    @Test
    public void test1()
    {
        assertEquals(1, 1, "Dummy test one, \n see if multiline works");
        assertEquals(1, 2, "Dummy test two");
        assertNotEquals(3, 2);
        assertTrue(true, "Dummy test three");

    }

    void nestedTest()
    {
        fail();
    }

    @Test
    public void test2()
    {
        nestedTest();
    }

    @Test
    public void test3()
    {
        assertTrue(false, "Some description");
    }

}
