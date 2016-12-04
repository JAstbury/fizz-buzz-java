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

}