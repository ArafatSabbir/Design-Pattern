package design.pattern;


public class DesignPattern {


    public static void main(String[] args) {
        TaxCalculator calculator= getCalculator();
        calculator.texCalculator();

    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
    
}
