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
        int number = 3;
        String result = "Fizz";
        assertEquals(result,fizzbuzz.results(number));
    }

    @Test
    public void testFizzWhenSix() {
        int number = 3;
        String result = "Fizz";
        assertEquals(result,fizzbuzz.results(number));
    }

    @Test
    public void testBuzzWhenFive() {
        int number = 5;
        String result = "Buzz";
        assertEquals(result,fizzbuzz.results(number));
    }

    @Test
    public void testBuzzWhenTen() {
        int number = 5;
        String result = "Buzz";
        assertEquals(result,fizzbuzz.results(number));
    }

    @Test
    public void testFizzBuzzWhenFifteen() {
        int number = 15;
        String result = "FizzBuzz";
        assertEquals(result,fizzbuzz.results(number));
    }

    @Test
    public void testFizzBuzzWhenThirty() {
        int number = 30;
        String result = "FizzBuzz";
        assertEquals(result,fizzbuzz.results(number));
    }

}