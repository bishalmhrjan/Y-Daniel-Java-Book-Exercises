package chapter11codes.elfpunkteneun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LargestRowsAndColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib zahl für Array Size Ein!");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];
        print(fill(matrix));
        largestColumns(matrix);
        largestRows(matrix);

    }

    // fills matrix with 0s and 1s.
    public static int[][] fill(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    // print the arrays.
    public static void print(int[][] matrix) {
        System.out.println("The randomw arra is ");
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

    }

    //count largest rows
    // count largest column

    public static int largestRows(int[][] a) {

        ArrayList<Integer> integers = new ArrayList<>();
        int[] count = new int[a.length];

        int matrixSize = a.length;

        for(int i = 0;i< matrixSize;i++){
            for(int j = 0;j< matrixSize; j++){
                if(a[i][j] ==1){
                    count[i]++;
                }
            }

        }
        int max = max(count);

        System.out.println(Arrays.toString(count));
        System.out.println("The largest row is "+ max+ " at index "+findIndex(count));

         return max;
    }


    public static int largestColumns(int[][] a) {

        ArrayList<Integer> integers = new ArrayList<>();
        int[] count = new int[a.length];
        int matrixSize = a.length;

        for(int i = 0;i< matrixSize;i++){
            for(int j = 0;j< matrixSize; j++){
                if(a[i][j] ==1){
                    count[j]++;
                }
            }

        }
        int max = max(count);

        System.out.println("The largest column is "+ max+ " at index "+findIndex(count));
        return max;
    }

    public static int max(int[] array) {
        int max = array[0];
            for(int i =0;i<array.length;i++){
                if(max < array[i]){
                    max = array[i];
                }
            }
       // System.out.println("The largest is "+ max );

        return max;

    }

    public static  int findIndex(int [] array){
        int index = 0;

        for(int i =0;i<array.length;i++){
            if(max(array)==array[i]){
                index = i;
            }
        }
        return index;
    }
}
