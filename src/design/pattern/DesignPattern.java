package design.pattern;


public class DesignPattern {


    public static void main(String[] args) {
        Account account=new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());



        /*TaxCalculator calculator= getCalculator();
        calculator.texCalculator();

         */
    }

   /* public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }

    */
    
}
