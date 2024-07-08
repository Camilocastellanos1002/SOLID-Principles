import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        

        Order order = new Order(Arrays.asList("Apple", "Strawberry","Blackberry","Pear"));
        Print myOrder = new Print();
        myOrder.printOrder(order);

        myOrder.printTotal(order.calculateTotal());

        RegisterOrder registerOrder = new RegisterOrder();
        registerOrder.saveToDatabase(order);

        
    }
}
