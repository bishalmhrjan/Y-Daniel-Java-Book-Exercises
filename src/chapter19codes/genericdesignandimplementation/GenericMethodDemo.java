package chapter19codes.genericdesignandimplementation;

public class GenericMethodDemo {
    public static  void main(String[] args){
        Integer [] integers ={2,4,6,8,10};
        String [] strings = {"Kathmandu","Delhi","Pokhara","Chitwan","Dharan"};

        print(integers);
        System.out.println();
        print(strings);


    }

    public static <E> void print(E[] array){
        for(int i =0;i< array.length;i++){
            System.out.print(" "+array[i]);
        }
    }
}
