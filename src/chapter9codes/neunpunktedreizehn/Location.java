package chapter9codes.neunpunktedreizehn;

import java.util.Scanner;

public class Location {


    private int row;
    private int column;
    private double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public static  Location locateLargest(double [] [] a){

        Scanner input = new Scanner(System.in);
        System.out.println("Gib Zahlen in double matrix ein!");
        int rowSize = a.length;
        int colSize = a[0].length;
        double max =0;
        double [][] matrix = new double[rowSize][colSize];
        double temp ;
        int substitutei=0;
        int substitutej= 0;

        for(int i =0;i<rowSize;i++ ){
            for(int j = 0;j< colSize;j++){

                if(i == 0 && j==0){
                    max= a[i][j];

                }
                a[i][j] = input.nextDouble();

                if(a[i][j] > max){
                    max = a[i][j];
                    substitutei = i;
                    substitutej = j;
                }
            }
        }
        Location location = new Location(rowSize,colSize,max);
        System.out.println("The location of the largest element is "+max+" at ("+substitutei+", "+substitutej+")");
        return  location;
    }


}
