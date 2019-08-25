import java.util.Date;

public class PayTM implements PaymentType {
    @Override
    public void transact(int value) {
        System.out.println("Payment through Paytm Done for Rupees"+value);
    }
public void bookMovieTicket(String moviename, Date moviDate){
    System.out.println("Ticket booked for date"+moviDate.toString());
}
}
