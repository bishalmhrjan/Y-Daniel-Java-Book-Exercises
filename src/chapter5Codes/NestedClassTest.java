package chapter5Codes;

import java.util.Scanner;

public class NestedClassTest {
    public static void main(String [] args) {
//5.11.2 Case study predictin the future edition
/*
        double tuition = 10000;
        int year =0;
        while(tuition < 20000){
            tuition = tuition * 1.07;
            year++;
        }

        System.out.println(" year is "+ year);


        // it prints 45 times, bcoz series would b like 1,2,3,4.....,9 and sum of them is 45
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i * j);

            }
            System.out.println("");
        }
        System.out.println("");


            for (int i = 1; i < 5; i++) {
                int j = 0;
                while (j < i) {
                    System.out.print(j + " ");
                    j++;
                }

    }
        System.out.println("");

        int i = 0;
        while (i < 5) {
            for (int k = i; k > 1;k--){



                System.out.print(k + " ");
            }
            System.out.println("****");
            i++;
        }
        System.out.println("");

        int ii = 1;
        do {
            int num = 1;
            for (int j = 1; j <= ii; j++) {
                System.out.print(num + "G");
                num += 2;
            }
            System.out.println();
            ii++;
        } while (ii <= 5);



        Scanner input = new Scanner(System.in);
        System.out.println("Press number 1");

        int number1 = input.nextInt();
        System.out.println("Press number 2");


        int number2 = input.nextInt();

/*
        int gcd =1;
        int k =2;


        while( k <= number1 && k <= number2 ){
            if( number1 % k == 0 && number2 % k== 0 ){
                gcd = k;
            }
            k++;
        }
      System.out.println("GCD is "+gcd);


        int lcm =0;
        int k =1;


        while (k <= number1 * number2){
            if(k % number1 == 0 && k % number2 == 0 ){
                lcm = k;
                break;


            }
            k++;
        }
        System.out.println("lcm is "+ lcm);




  int sum = 0;
  int number = 0;

  while(number < 20){
      number++;
      if(number == 10 || number ==11){
          continue;
      }
      sum += number;

  }
  System.out.println("sum "+ sum+ ", number "+ number);


        // break example
        int i =0;
        boolean condition = true;
        while (   i<5 ){
            i++;
            if(i==3){
              break;

            }




        }
        System.out.println(i);
        System.out.println();

        int jj =0;

        while (jj<10){
            jj++;
            if(jj==3){


                continue;

            }

            System.out.println(jj);
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (i % 3 == 0) continue;
            sum += i;
        }


        int i = 0, sum1 = 0;
        while (i < 4) {
            i++;
            if (i % 3 == 0) continue;
            sum1 += i;

        }
*/
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2)
                    break;
                System.out.println(i * j);
            }
            System.out.println(i);
        }

    }}