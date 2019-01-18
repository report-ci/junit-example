import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MasterTest
{
    @Test
    public void test1()
    {
        assertEquals(1, 1, "Dummy test one, \n see if multiline works");
        assertEquals(0, 1, "Dummy test two");
        assertNotEquals(3, 2);
        assertTrue(false, "Dummy test three");

    }

    @Test
    public void test2()
    {
        fail();
    }

    @Test
    public void test3()
    {
        assertTrue(true, "Some description");
    }

}
