import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {
    private Employee employee;

    void saveToDataBase(){
        Map<String, Double> register = new HashMap<>();

        register.put(employee.getName(), employee.getSalary());
    }
}
