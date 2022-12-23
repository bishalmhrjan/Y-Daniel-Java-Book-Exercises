public class MethodClass {
    public static void main(String [] args){
        int firstSum = findSum(1,10);
        int secondSum = findSum(20,37);
        int thirdSum = findSum(35,49);


        System.out.println("sume of numbers are "+ firstSum +","+ secondSum+","+thirdSum);

    }

    public  static int findSum(int start, int last){

        int sum= 0;

        for(int i = start;i< last ;start++){
            sum += i;
        }


        return  sum;
    }
}
