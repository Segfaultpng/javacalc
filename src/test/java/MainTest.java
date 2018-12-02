import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    Main calc;

    @Before
    public void setup(){

        calc = new Main();

    }

    @Test
    public void addTest(){

        assertEquals("e.g 2 + 2 = 4",2,calc.add(1,1));
    }

    @Test
    public void subtractTest(){
        assertEquals("e.g 2 - 2 = 0",1,calc.subtract(2,1));
    }

    @Test
    public void multiplyTest(){
        assertEquals("e.g 2 * 2 = 4",2,calc.multiply(2,1));
    }

    @Test
    public void divideTest(){
        assertEquals("e.g 2 / 2 = 1",5,calc.divide(10,2));
    }
}
