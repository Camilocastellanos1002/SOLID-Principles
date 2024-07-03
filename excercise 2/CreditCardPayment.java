import javax.swing.JOptionPane;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public void processPayment(String paymentType) {
        JOptionPane.showMessageDialog(null,"the "+ paymentType +" payment is accepted and will be processed");
    }
    
}
