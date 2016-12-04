/**
 * Created by jessastbury on 01/12/2016.
 */
public class Fizzbuzz {

    public String results(int input) {
        if(input % 15 == 0) {
            return "FizzBuzz";
        }
        if(input % 3 == 0) {
            return "Fizz";
        }
        if(input % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(input);
    }
}
