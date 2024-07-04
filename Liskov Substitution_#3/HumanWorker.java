public class HumanWorker implements Eatable,Workable {

    @Override
    public void work() {
        System.out.println("Working because i want stop being a poor");
    }

    @Override
    public void eat() {
        System.out.println("eating because i need to be able to work and live");
    }
    
}
