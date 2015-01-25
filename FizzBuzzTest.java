import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

@Test
public void knowsThreeIsDivisibleByThree() {
  System.out.println("Test if isDivisibleByThree returns true...");
  FizzBuzz fizzbuzz = new FizzBuzz();
  assertTrue("3 is divisible by 3", fizzbuzz.isDivisibleByThree(3));
 }

}
