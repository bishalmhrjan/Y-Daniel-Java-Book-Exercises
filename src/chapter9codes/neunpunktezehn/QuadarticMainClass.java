package chapter9codes.neunpunktezehn;

import java.util.Scanner;

public class QuadarticMainClass {
    public static  void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("gib nr für a,b,und c ein!");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Root1 ist "+quadraticEquation.getRoot1());
        System.out.println("Root2 ist "+quadraticEquation.getRoot2());

    }
}
