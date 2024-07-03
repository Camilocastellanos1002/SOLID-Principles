import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Scanner scan = new Scanner(System.in);
        String option="";
        do {
            option = JOptionPane.showInputDialog(null, "white the option you want to pay: \n" +
                                "credit\n"+
                                "paypal \n" +
                                "exit");
            scan.close();
            if (option.equals("credit")) {
                paymentProcessor.processPayment(option);
            }else if (option.equals("paypal")) {
                paymentProcessor.processPayment(option);
            }
        } while (!option.equals("exit"));
        
            
    }
}
