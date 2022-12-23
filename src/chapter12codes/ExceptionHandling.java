package chapter12codes;

public class ExceptionHandling {
    public static void main(String[] args) {
        int number = 0;
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");


                System.out.println(1 / 0);
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Continue after the catch block");
        System.out.println("here prints number "+number++);

    }


}
