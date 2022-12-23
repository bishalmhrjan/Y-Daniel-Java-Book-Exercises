package chapter7codes;

public class Arrays {
    public static void main(String [] args){
        int []numbers = {1,2,5,7,3,8,9};

        int [] doubleNumber = doubleArray(numbers);
         // printArray(numbers);
        // System.out.println();
        //System.out.println("----"+ numbers[4]);

   //  printArray(  reverseArray(doubleNumber));
     //   System.out.println("printing double reverse in nextline");


printMax(numbers);


    }

    public static  void printMax(int...numberrs){

        int numb = numberrs.length;
        int max = 0;
        int temp = 0;

        for(int i =1;i< numb;i++){
            max = numberrs[0];
            if(max >= numberrs[i]){

                continue;
            }else{
                max = numberrs[i];
            }

        }
        System.out.println("max is "+ max);
    }

    public static int [] doubleArray(int []arrayToBeCopied){
        int n = arrayToBeCopied.length;

        for (int i =0;i < n;i++){
           arrayToBeCopied[i] = 2*arrayToBeCopied[i];
        }


        return arrayToBeCopied;
    }

    public static void printArray(int [] array){
        for (int i =0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }

    public static int[] reverseArray(int []array){
        int [] reverseArray = new int[array.length];
        int size = array.length;

        for(int i = 0 ; i < size ; i++){
            reverseArray[i] = array[size-1-i];
        }
        return reverseArray;
    }


}
