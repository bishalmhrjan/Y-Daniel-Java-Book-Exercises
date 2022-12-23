package chapter12codes.exercisecodes.punktezwei;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws InputMismatchException {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean condition = true;
        Scanner input = new Scanner(System.in);

        while (condition) {

            System.out.println("gib nummer ein!");
            try {
                Integer index = input.nextInt();
                if (index >= 13 || index <= 0) {
                    condition = false;
                    throw new ArrayIndexOutOfBoundsException("wrong number");
                }

                switch (index) {

                    case 1:
                        System.out.println("Month  is " + months[0] + ", days in month is " + dom[0]);

                        break;
                    case 2:
                        System.out.println("Month  is " + months[1] + ", days in month is " + dom[1]);

                        break;
                    case 3:
                        System.out.println("Month  is " + months[2] + ", days in month is " + dom[2]);

                        break;
                    case 4:
                        System.out.println("Month  is " + months[3] + ", days in month is " + dom[3]);

                        break;
                    case 5:
                        System.out.println("Month  is " + months[4] + ", days in month is " + dom[4]);

                        break;
                    case 6:
                        System.out.println("Month  is " + months[5] + ", days in month is " + dom[5]);

                        break;
                    case 7:
                        System.out.println("Month  is " + months[6] + ", days in month is " + dom[6]);

                        break;
                    case 8:
                        System.out.println("Month  is " + months[7] + ", days in month is " + dom[7]);

                        break;
                    case 9:
                        System.out.println("Month  is " + months[8] + ", days in month is " + dom[8]);

                        break;
                    case 10:

                        System.out.println("Month  is " + months[9] + ", days in month is " + dom[9]);

                        break;
                    case 11:
                        System.out.println("Month  is " + months[10] + ", days in month is " + dom[10]);
                        break;
                    case 12:
                        System.out.println("Month  is " + months[11] + ", days in month is " + dom[11]);
                        break;

                }
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
            } catch (ArrayIndexOutOfBoundsException arr) {
                System.out.println(arr.getMessage());
            }
        }
    }
}
