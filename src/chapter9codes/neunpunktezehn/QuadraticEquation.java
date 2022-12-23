package chapter9codes.neunpunktezehn;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double root = 0;
        if (this.getDiscriminant() > 0) {
            root = (-b + Math.sqrt(this.getDiscriminant())) / 2 * a;
            return root;
        }
        System.out.println("The equation has no roots.");
        return root;
    }

    public double getRoot2() {
        double root = 0;
        if (this.getDiscriminant() > 0) {

            root = (-b - Math.sqrt(this.getDiscriminant())) / 2 * a;
            return root;
        }
        System.out.println("The equation has no roots.");
        return root;
    }
}
