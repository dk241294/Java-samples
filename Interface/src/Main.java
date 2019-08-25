class Main {
    public static void main(String[] args) {
        PaymentType paymentType = new PayTM();
        paymentType.transact(10);
        PayTM paytm = new PayTM();
        paytm.transact(100);
        PaymentType paymentType2 = new Mowiquik();
        paymentType2.transact(1);
        Main main = new Main();
        main.makePayment(paymentType,100);
        main.makePayment(paymentType2,3000);
    }
    void  makePayment(PaymentType paymentType, int value){ 
        paymentType.transact(value);
    }
}