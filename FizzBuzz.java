public class FizzBuzz {

  public boolean isDivisibleByThree(int n) {
    return isDivisibleBy(n, 3);
  }

  public boolean isDivisibleByFive(int n) {
    return isDivisibleBy(n, 5);
  }

  public boolean isDivisibleByFifteen(int n) {
    return isDivisibleBy(n, 15);
  }

  public boolean isDivisibleBy(int n, int divisor) {
    return n % divisor == 0;
  }

  public String playGame(int n) {
    if (isDivisibleByFifteen(n)) return "fizzbuzz";
    if (isDivisibleByFive(n)) return "buzz";
    if (isDivisibleByThree(n)) return "fizz";
    return Integer.toString(n);
  }

}