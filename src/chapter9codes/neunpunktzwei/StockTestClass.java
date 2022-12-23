package chapter9codes.neunpunktzwei;

public class StockTestClass {
    public  static void main(String [] args){
        Stock stock = new Stock("ORCL","Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println("change in percent ---> "+stock.getChangePercent());
    }
}
