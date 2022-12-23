package chapter11codes.elfpunkteacht;

public class MainClass {
    public static  void main(String [] args){
        Account bishal = new Account("Bishal",4,4000);



        Account sanjeev = new Account("sanjeev",5,500);
        sanjeev.deposit(100);
        sanjeev.withdraw(200);


        System.out.println(sanjeev.toString());
    }
}
