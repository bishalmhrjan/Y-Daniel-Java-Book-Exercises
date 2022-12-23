package chapter6codes;

import java.util.Scanner;

public class chapter6point6 {
    public static void main(String []args){


        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println( "here is gcd -->"+gcd(firstNumber,secondNumber));

    }


    public static int gcd(int a, int b){

        int gcdNumber = 1;
        int k = 2;

        while(k <= a && k <= b ){
            if(a % k == 0 && b % k == 0){
                gcdNumber = k;


            }
            k++;
        }

        return gcdNumber;
    }
}
