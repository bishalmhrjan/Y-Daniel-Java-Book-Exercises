package chapter12codes.testcodes;

public class MainClass {
    public static void main(String[] args) {
        /**
         try {

         CircleWithException circleWithException2 = new CircleWithException(5);
         CircleWithException circleWithException3 = new CircleWithException(-5);
         CircleWithException circleWithException = new CircleWithException(0);
         } catch (IllegalArgumentException illegalArgumentException) {
         System.out.println("messages :" + illegalArgumentException.getMessage());
         }

         System.out.println("Number of Circleobject created is "+CircleWithException.getNumberOfCircle());
         */
        try {

            System.out.println("After the method call.");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Here inside finally statements");
            System.out.println("Here inside finally statements");
            System.out.println("Here inside finally statements");
        }

    }
    public static  void method() throws  Exception{
        System.out.println(1/0);
    }

    public void m(int value) throws  Exception{
        if(value < 40){
            throw  new Exception("Value is too small");
        }
    }

}
