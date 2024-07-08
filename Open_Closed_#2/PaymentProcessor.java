public class PaymentProcessor implements PaymentMethod{

    @Override
    public void processPayment(String paymentType) {
        if (paymentType.equals("credit")) {
            CreditCardPayment cardPayment = new CreditCardPayment();
            cardPayment.processPayment(paymentType);
        } else if (paymentType.equals("paypal")) {
            PayPalPayment palPayment = new PayPalPayment();
            palPayment.processPayment(paymentType);
        }
    }
    
}
