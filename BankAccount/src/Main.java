public class Main {
    public static void main(String[] args) {
    BankAccount bobsaccount=new BankAccount();
    bobsaccount.setCustomerName("bob");
    bobsaccount.setAccountNumber(123456);
    bobsaccount.setBalance(0);
    bobsaccount.setEmailId("deepak@gmail.com");
    bobsaccount.setPhoneNumber(1234466789);
    bobsaccount.getCustomerName();
    bobsaccount.getAccountNumber();
    bobsaccount.getBalance();
    bobsaccount.getEmailId();
    bobsaccount.getPhoneNumber();
    bobsaccount.withdrawl(100);
    bobsaccount.deposit(20);
    bobsaccount.deposit(1000);
    bobsaccount.withdrawl(12 );

    }

}
