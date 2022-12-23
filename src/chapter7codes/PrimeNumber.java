package chapter7codes;

public class PrimeNumber {
public  static  void main(String [] args) {


    final int NUMBER_OF_PRIMES = 50;
    final int NUMBER_OF_PRIMES_PER_LINE = 10;
    int count = 0;
    int number = 2;


    while (count < NUMBER_OF_PRIMES) {
        boolean isPrime = true;
        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            count++;


            if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                System.out.println(number + ",");
            } else {
                System.out.print(number + ",");

            }
        }

        number++;
    }
}
}
