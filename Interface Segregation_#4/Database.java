public class Database implements DataStorage{

    @Override
    public void save(String data) {
        System.out.println("saving "+data+" in the database registers");
    }
    
}
