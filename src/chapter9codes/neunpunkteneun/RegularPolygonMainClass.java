package chapter9codes.neunpunkteneun;

public class RegularPolygonMainClass {
    public static  void main ( String [] args){
    RegularPolygon regularPolygon = new RegularPolygon();
    System.out.println(regularPolygon.toString());

    System.out.println("");

    RegularPolygon regularPolygon1 = new RegularPolygon(6,4);
        System.out.println(regularPolygon1.toString());


    RegularPolygon regularPolygon2 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println(regularPolygon2.toString());
}
}
