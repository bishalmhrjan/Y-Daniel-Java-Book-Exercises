package chapter11codes.elfpunktevier;

import java.util.ArrayList;

public class ArrayListMainClass {
    public static void main(String [] args){

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(20);
        integers.add(-2);
        integers.add(20);
        integers.add(200);
        integers.add(-2000);
        integers.add(-200000);
        max(integers);
    }

    public static Integer max(ArrayList<Integer> list){
        Integer max =list.get(0);
                ;
        int size = list.size();
        for(int i =0;i<size;i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println(max);
        return max;

    }
}
