import java.util.List;
import java.util.Random;

public class Order implements Calculate{

    private List<String> items;
    private double totalAmount=0;

    public Order(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public double calculateTotal() {
        int prices = items.size();
        Random randomPrice = new Random();
        for(int i=0; i<prices;i++){
            totalAmount+= randomPrice.nextDouble()*1000;
        }

        return totalAmount;
    }


    
}
