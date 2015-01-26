public class FizzBuzz {

  public boolean isDivisibleByThree(int n) {
    if (n % 3 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isDivisibleByFive(int n) {
    if (n % 5 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isDivisibleByFifteen(int n) {
    if (n % 15 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public String playGame(int n) {
    if (isDivisibleByFifteen(n) == true) {
      return "fizzbuzz";
    } else if (isDivisibleByFive(n) == true) {
      return "buzz";
    } else if (isDivisibleByThree(n) == true) {
      return "fizz";
    } else {
      return String.valueOf(n);
    }
  }

}