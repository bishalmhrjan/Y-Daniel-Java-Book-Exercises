package chapter9codes.neunpunkteelf;

public class LinearEquation {
    private double a,b,c,d,e,f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable(){
        if(this.getDiscriminator()==0){
            System.out.println("The Equation has no solutions!");

        }
        return  this.getDiscriminator() != 0;
    }

    public double getX(){

        return (this.getE()*this.getD()-this.getB()*this.getF())/(this.getDiscriminator());
    }

    public double getDiscriminator(){
        if(this.getA()*this.getD()-this.getB()*this.getC() == 0){
            System.out.println("The Equation has no solutions!");
            System.exit(1);
        }
        return   this.getA()*this.getD()-this.getB()*this.getC();

    }

    public double getY(){
        return (this.getA() * this.getF() -this.getE() * this.getC()) / this.getDiscriminator();
    }
}
