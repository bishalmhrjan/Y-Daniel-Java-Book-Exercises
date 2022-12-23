package chapter6codes;

public class PrimeNumberMethod {

    public static void main(String[] args) {


        int count = 0;
        final int NUMBER_PRIME_NUMBER = 50;
        final int NUMBER_PER_LINE = 10;
        int number = 2;
        while (count < NUMBER_PRIME_NUMBER) {

            if (isPrime(number)) {
                count++;
                if (count % NUMBER_PER_LINE == 0) {
                    System.out.println(number + ",");
                } else {
                    System.out.print(number + ",");

                }
            }
            number++;
        }

    }

    public static boolean isPrime(int number) {
        boolean result = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                result = false;
                return result;
            }
        }
        return result;
    }
}
