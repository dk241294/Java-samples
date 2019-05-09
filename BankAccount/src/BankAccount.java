public class BankAccount {
    private String customerName;
    private int accountNumber;
    private int balance;
    private String emailId;
    private int phoneNumber;


    BankAccount(){
        customerName="rahul";
        accountNumber=123456;
        balance=0;
        emailId="dk@gmail.com";


    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void withdrawl(int withdrawAmount) {

        if (withdrawAmount > this.balance) {
            System.out.println("amount balance is less!!!   "+this.balance+"   only");
        } else {
            this.balance = this.balance - withdrawAmount;
            System.out.println("amount withdrawn=  " + withdrawAmount);
            System.out.println("balance remaining=  " + this.balance);
        }
    }
            public void deposit (int depositAmount) {
                this.balance +=  depositAmount;
                System.out.println("deposited amount=   " + depositAmount +  "   new balance=  " + this.balance);
            }


    }

