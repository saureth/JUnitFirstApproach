package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcularTest {
    
    public CalcularTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Add method, of class Calcular.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        float one = 1.0F;
        float two = 0.0F;
        Calcular instance = new Calcular();
        float expResult = 1.0F;
        float result = instance.Add(one, two);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of Substract method, of class Calcular.
     */
    @Test
    public void testSubstract() {
        System.out.println("Substract");
        float one = 3.0F;
        float two = 2.0F;
        Calcular instance = new Calcular();
        float expResult = 1.0F;
        float result = instance.Substract(one, two);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of Multiply method, of class Calcular.
     */
    @Test
    public void testMultiply() {
        System.out.println("Multiply");
        float one = 0.0F;
        float two = 4.0F;
        Calcular instance = new Calcular();
        float expResult = 0.0F;
        float result = instance.Multiply(one, two);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of Divide method, of class Calcular.
     */
    @Test
    public void testDivide() {
        System.out.println("Divide");
        float one = 112.0F;
        float two = 4.0F;
        Calcular instance = new Calcular();
        float expResult = 28.0F;
        float result = instance.Divide(one, two);
        assertEquals(expResult, result, 0.0f);
    }
    
    /**
     * Test not to divide by zero.
     */
    @Test
    public void testValidateDivide() {
        System.out.println("DivideByZero");
        float two = 4.0f;
        Calcular instance = new Calcular();
        boolean notANumber= instance.validateDivide(two);
        assertTrue(notANumber);
    }

    /**
     * Test of getFirstValueF method, of class Calcular.
     */
    @Test
    public void testGetFirstValueF() {
        System.out.println("getFirstValueF");
        Calcular instance = new Calcular();
        float expResult = 0.0F;
        float result = instance.getFirstValueF();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setFirstValueF method, of class Calcular.
     */
    @Test
    public void testSetFirstValueF() {
        System.out.println("setFirstValueF");
        float firstValueF = 0.0F;
        Calcular instance = new Calcular();
        instance.setFirstValueF(firstValueF);
    }

    /**
     * Test of getSecondValueF method, of class Calcular.
     */
    @Test
    public void testGetSecondValueF() {
        System.out.println("getSecondValueF");
        Calcular instance = new Calcular();
        float expResult = 0.0F;
        float result = instance.getSecondValueF();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setSecondValueF method, of class Calcular.
     */
    @Test
    public void testSetSecondValueF() {
        System.out.println("setSecondValueF");
        float secondValueF = 0.0F;
        Calcular instance = new Calcular();
        instance.setSecondValueF(secondValueF);
    }

    /**
     * Test of getResultF method, of class Calcular.
     */
    @Test
    public void testGetResultF() {
        System.out.println("getResultF");
        Calcular instance = new Calcular();
        float expResult = 0.0F;
        float result = instance.getResultF();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of equals method, of class Calcular.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Calcular instance = new Calcular();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }    
}