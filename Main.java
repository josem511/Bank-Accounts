
public class Main {

    public static void main(String[] args) {

        //"56789",2.50, "Default name", "Default address", "default phone"
        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getNumber()); //get account number
        System.out.println(bobsAccount.getBalance());//get balance

        //checks if balance is sufficient, if it is, it withdraws
        bobsAccount.withdrawal(100.0);
        
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account josesAccount = new Account("Jose", "jose@email.com", "510388232");
        System.out.println(josesAccount.getNumber()+ " name " + josesAccount.getCustomerName());

        VipCustomer joseVip = new VipCustomer("Jose Romero",1000);
        joseVip.getCreditLimit();
        joseVip.getEmailAddress();
        joseVip.getName();
    }
}
