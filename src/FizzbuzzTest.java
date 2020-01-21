import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzbuzzTest {
    private Fizzbuzz fizzbuzz;

    @Before
    public void before() {
        fizzbuzz = new Fizzbuzz();
    }

    @Test
    public void convertOneToString() {
        assertEquals("1", fizzbuzz.compute(1));
    }

    @Test
    public void convertTreeToFizz() {
        assertEquals("Fizz", fizzbuzz.compute(3));
    }

    @Test
    public void convertFiveToBuzz() {
        assertEquals("Buzz", fizzbuzz.compute(5));
    }

    @Test
    public void convertFifteenToFizzBuzz() {
        assertEquals("FizzBuzz", fizzbuzz.compute(15));
    }

    @Test
    public void convertZeroToString() {
        assertEquals("0", fizzbuzz.compute(0));
    }
}