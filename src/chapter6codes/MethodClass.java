package chapter6codes;

public class MethodClass {
    public static void main(String[] args) {
        System.out.println("hello");

        int firstSum = findSum(1, 10);
        int secondSum = findSum(20, 37);
        int thirdSum = findSum(35, 49);

        // System.out.println("sume of numbers are " + firstSum + "," + secondSum + "," + thirdSum);
     //   System.out.println(findSum(2, 5));

       // System.out.println(findMax(-12, -2));
        // System.out.println(method(-12, 2));


        int max = 0;
        max(1, 2, max);

      //  System.out.println(max);



        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }



        int times = 3;
        System.out.println("Before the call,"
                + " variable times is " + times);
// Invoke nPrintln and display times
        nPrintln("Welcome to Java!", times);

        System.out.println("After the call,"
                + " variable times is " + times);
    }
    // Print the message n times
    public static void nPrintln( String message, int number) {
        while (number > 0) {
            System.out.println("n = " + number);
            System.out.println(message);
            number--;
        }
    }
    public static void method1(
            int i, int num) {
        for (int j = 1; j <= i; j++) {
          //  System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }

    public static void max(int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;

    }
    public static int findSum(int start, int last) {

        int sum = 0;

        for (int i = start; i <= last; i++) {
            sum += i;
        }


        return sum;
    }

    /**
     * find biggest number
     */

    public static int findMax(int firstNumber, int secondNumber) {

        if (firstNumber <= secondNumber) {
            return secondNumber;

        }
        return firstNumber;
    }
    public static  double method(double i, double j){

        while( i <= j){
            j--;
        }

        return  j;
    }
}
