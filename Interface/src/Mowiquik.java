// Pig "implements" the PaymentType interface
public class Mowiquik implements PaymentType {
    @Override
    public void transact(int value) {
        // The body of transact() is provided here
        System.out.println("Payment through Moviquick Done for Rupees"+value);
    }


}
