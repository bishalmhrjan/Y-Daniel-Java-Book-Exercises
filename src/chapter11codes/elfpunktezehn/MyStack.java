package chapter11codes.elfpunktezehn;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStack extends ArrayList<Object> {

    public void addString() {

        Scanner input = new Scanner(System.in);
        System.out.println("Gib String ein!");
        String string = input.nextLine();
        this.add(string);
    }

    public void printStringReverseOrder() {
        ArrayList<Object> strings = new ArrayList<>();
        int size = this.size();

        for (int i = size; i <= 0; i--) {
            strings.add(this.get(i));

        }
        for (Object obj : strings) {
            System.out.print(" " + obj);
        }

    }


    public static void sortArray(ArrayList<Integer> list) {
        list = new ArrayList<>(5);
        Scanner input = new Scanner(System.in);
        System.out.println("Gib Integer ein!");

        while (list.size() != 5) {


            Integer integer = input.nextInt();
            list.add(integer);
        }
        ArrayList<Integer> integers = new ArrayList<>();

        while (list.size() >= 0) {
            integers.add(findMaxInArrayList(list));
        }

        for (Integer integer1 : integers) {
            System.out.println(integer1);
        }
    }

    public static int findMaxInArrayList(ArrayList<Integer> integers) {

        int max = 0;

        for (int i = 0; i < integers.size(); i++) {
            if (max <= integers.get(i)) {
                max = integers.get(i);
                integers.remove(i);
            }
        }

        return max;

    }


    public static double sum(ArrayList<Double> list) {

        list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count != 5) {
            list.add(input.nextDouble());
            count++;
        }

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);

        return sum;

    }

    //Removes duplicates
    public static void removeDuplicate(ArrayList<Integer> list) {

        System.out.println("Enter 10 integers");
        Scanner input = new Scanner(System.in);
        int count = 0;
       // list = new ArrayList<>();
        while (count!=10) {
            int number = input.nextInt();
            if(!list.contains(number)){
                list.add(number);
            }

            count++;
            System.out.println("count is ---> "+count);
        }
        System.out.print("The distinct integers are ");

        for (Integer integer : list){
            System.out.print(" "+integer);
        }
        System.out.println("---->"+count);


    }




}
