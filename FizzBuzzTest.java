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

  @Test
  public void knowsFiveIsDivisibleByFive() {
    System.out.println("Test if five isDivisibleByFive returns true...");
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertTrue("5 is divisible by 5", fizzbuzz.isDivisibleByFive(5));
  }

  @Test
  public void knowsOneIsntDivisibleByFive() {
    System.out.println("Test if one isDivisibleByFive returns false...");
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertFalse("1 is divisible by 5", fizzbuzz.isDivisibleByFive(1));
  }

  @Test
  public void knowsFifteenIsDivisibleByFifteen() {
    System.out.println("Test if fifteen isDivisibleByFifteen returns true...");
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertTrue("15 is divisible by 15", fizzbuzz.isDivisibleByFifteen(15));
  }

  @Test
  public void knowsOneIsntDivisibleByFifteen() {
    System.out.println("Test if one isDivisibleByFifteen returns false...");
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertFalse("1 is divisible by 15", fizzbuzz.isDivisibleByFifteen(1));
  }

  @Test
  public void knowsThreeIsFizz() {
    System.out.println("Test if play fizzbuzz three returns fizz...");
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertEquals("fizz", fizzbuzz.playGame(3));
  }

  @Test
  public void knowsFiveIsBuzz() {
    System.out.println("Test if play fizzbuzz five returns buzz...");
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertEquals("buzz", fizzbuzz.playGame(5));
  }

}
