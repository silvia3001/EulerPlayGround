package euler;

import java.util.ArrayList;
import java.util.List;

  /**
   * The prime factors of 13195 are 5, 7, 13 and 29.
   * What is the largest prime factor of the number 600851475143 ?
   */
public class Problem03 {

  static List<Long> primeNumbers = new ArrayList<Long>();

  static long CEILING = 600851475143L;
  static long newCeiling = CEILING;
  static long maxFactor = 0;
  public static void main(String[] args) {
    long n = 5;
    while (n * n < newCeiling) {
      if (isPrime(n)) {
        primeNumbers.add(n);
        if (CEILING % n == 0) {
          maxFactor = n;
          newCeiling = CEILING / maxFactor;
          // break;
        }
        System.out.println(n);
      }
      n = n + 6;
    }
    System.out.println("Result = " + maxFactor);
  }

  static boolean isPrime(long n) {
    for (long l : primeNumbers) {
      if (n % l == 0) {
        return false;
      }
    }
    return true;
  }
}
