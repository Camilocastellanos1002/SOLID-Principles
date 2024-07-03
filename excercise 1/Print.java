public class Print {

    void printOrder(Order order){
        System.out.println(" The order list is:");
        for (String i : order.getItems()) {
            System.out.println(i);
        }
    }

    void printTotal(Double d){
        System.out.println("the total items price is: \n"+"$ "+d);
    }
}