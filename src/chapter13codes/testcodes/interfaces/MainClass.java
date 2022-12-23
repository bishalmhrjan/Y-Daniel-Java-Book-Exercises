package chapter13codes.testcodes.interfaces;

public class MainClass {
    public static void main(String [] args){

        Edible e = new Apple();
        Animal animal = new Tiger();
        Object [] objects = {new Tiger(), new Chicken(), new Apple()};

        for( int i =0;i<objects.length;i++){
            if(objects[i] instanceof  Edible){
                System.out.println(((Edible) objects[i]).hotToEat());
            }else{
                if(objects[i] instanceof  Animal){
                    System.out.println(((Animal) objects[i]).sound());

                }
            }
        }
        System.out.println(e.hotToEat());
        System.out.println(animal.sound());

        B b = new B();
         b.m1();
    }
}
