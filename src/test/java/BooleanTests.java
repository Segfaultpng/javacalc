import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BooleanTests {

    BooleanWork truthyOrFalsy;

    @Before
    public void setup(){

        truthyOrFalsy = new BooleanWork();

    }

    @Test
    public void isBiggerThanTrue(){

        assertTrue("if x > y method should return true",truthyOrFalsy.greaterThan(2,1));
    }

    @Test
    public void isBiggerThanFalse(){

        assertFalse("if x < y method should return false",truthyOrFalsy.greaterThan(2,1));
    }

    @Test
    public void isEqualsToTrue(){

        assertTrue("if x = y method should return true",truthyOrFalsy.isEqualTo(1,1));
    }

    @Test
    public void isEqualsToFalse(){

        assertTrue("if x != y method should return false",truthyOrFalsy.isEqualTo(2,1));
    }

}
