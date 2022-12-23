package chapter4Codes;

import java.util.Scanner;

public class HexDigit2Decimal {
    public  static  void  main (String [] args){
        int a ='Y'-'A'; // ascii values difference
        int y =89-65;
        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String hexString = scanner.nextLine();


        if(hexString.length() !=1){
           // System.out.println();
            System.out.println("you must enter exactly one character");
            System.exit(1);
        }

        char ch = Character.toUpperCase(hexString.charAt(0));
        if('A' <=ch && 'F' >= ch){
            int value = ch -'A'+10;
            System.out.println("The decimal value for hex digit "+ ch +" is "+ value);
        }
        else  if(Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit "+ch+" is "+ch);
        }
        else {
            System.out.println(ch+" is an invalid input");

        }



    }
}
