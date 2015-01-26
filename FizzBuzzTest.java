import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

@Test
public void knowsThreeIsDivisibleByThree() {
  System.out.println("Test if three isDivisibleByThree returns true...");
  FizzBuzz fizzbuzz = new FizzBuzz();
  assertTrue("3 is divisible by 3", fizzbuzz.isDivisibleByThree(3));
 }

@Test
public void knowsOneIsntDivisibleByThree() {
  System.out.println("Test if one isDivisibleByThree returns false...");
  FizzBuzz fizzbuzz = new FizzBuzz();
  assertFalse("1 is divisible by 3", fizzbuzz.isDivisibleByThree(1));
}

}
