/**
 * Created by jessastbury on 01/12/2016.
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzbuzzTest {

    Fizzbuzz fizzbuzz;

    @Before
    public void init() {
       fizzbuzz = new Fizzbuzz();
    }

    @Test
    public void testFizzWhenThree() {
        assertEquals("Fizz",fizzbuzz.results(3));
    }

    @Test
    public void testFizzWhenSix() {
        assertEquals("Fizz",fizzbuzz.results(3));
    }

    @Test
    public void testBuzzWhenFive() {
        assertEquals("Buzz",fizzbuzz.results(5));
    }

    @Test
    public void testBuzzWhenTen() {
        assertEquals("Buzz",fizzbuzz.results(5));
    }

    @Test
    public void testFizzBuzzWhenFifteen() {
        assertEquals("FizzBuzz",fizzbuzz.results(15));
    }

    @Test
    public void testFizzBuzzWhenThirty() {
        assertEquals("FizzBuzz",fizzbuzz.results(30));
    }

    @Test
    public void testNumberWhenTwo() {
        assertEquals("2",fizzbuzz.results(2));
    }

    @Test
    public void testNumberWhenSeven() {
        assertEquals("7",fizzbuzz.results(7));
    }

}