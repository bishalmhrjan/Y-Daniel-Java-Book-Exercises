package chapter5Codes.TestsInChapter5;

import java.util.Scanner;

public class TestClass5 {
   // public static void main(String [] args){}
    public static void main(String [] args){
        System.out.println("Helllllooooooooo");
/**
        int i =1;
// 5.2.2 a dont print , because it holds not true conditions
        while (i<10){
            if(i%2 ==0){
                System.out.println(i);
            }
        }
// 5.2.2 b dont print , because it holds not true conditions

        while (i<10){
            if(i%2 ==0){
                System.out.println(i++);
            }
        }
        System.out.println("Helllllooooooooo");


        // 5.2.2 c prints, 3,5,7,9
        while (i<10){
            if((i++)%2  ==0){ // i++ is i = i+1, and this operation is done only after checking i %2 ==0
                System.out.println(i);
            }
          //  System.out.println(i);

        }


        int a = 1;
        System.out.println();
        // 5.2.2 c prints, 2,4,6,8
        while (a<10){
            if((++a)%2  ==0){ // a++ is a =a+1, and this operation is done before checking a %2 ==0
                System.out.println(a);
            }
            //System.out.println(a);

        }

// 5.5.1 max is 5 and number is obviously 0
        Scanner input = new Scanner(System.in);
        int number, max;

        number = input.nextInt();
        max = number;

        while(number !=0){
            number = input.nextInt();
            if(number>max){
                max = number;
            }
        }
        System.out.println("max is "+max);
        System.out.println("number "+number);


// prints max 5 and number 0 as it did before in while loop
        Scanner input = new Scanner(System.in);
        int number, max;

        number = input.nextInt();
        max = number;

        do{
            number = input.nextInt();
            if(number>max){
                max = number;
            }
        } while(number !=0);
        System.out.println("max is "+max);
        System.out.println("number "+number);




// ++i and i++ does not make any difference in for loop
int sum =0;
    for(int i=3;i<6;i++){
        System.out.println(i);
        sum +=i;
    }
        System.out.println(sum);

        System.out.println( );

        int sum1 =0;
        for(int i=3;i<6;++i){
            System.out.println(i);
            sum1 +=i;
        }
        System.out.println(sum1);



 */
int i=0;
do{
    System.out.println(i + 4);
  i++;
    } while (i < 10);



             for (int j = 0; j < 10; j++) {
                 System.out.println(j + 4);
             }

    }

}
