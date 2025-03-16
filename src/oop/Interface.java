package oop;

interface Service{
    default void  test(){};
    void convertRielToDollar(Double riel);
    void convertDollarToRiel(Double dollar);
}
class CurrencyExchange implements Service{
    @Override
    public void convertRielToDollar(Double riel) {
        System.out.println("Result of dollar: " + (riel/4000));
    }
    @Override
    public void convertDollarToRiel(Double dollar) {
        System.out.println("Result in riel: " + (dollar*4000));
    }
}

public class Interface{
    public static void main(String[] args) {
        CurrencyExchange exchange = new CurrencyExchange();
        exchange.convertDollarToRiel(2.0);
        exchange.convertRielToDollar(1.2);
    }
}
