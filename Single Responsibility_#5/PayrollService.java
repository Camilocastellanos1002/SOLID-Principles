import java.util.Random;

public class PayrollService {

    private Employee employee;

    void calculatePay(){
        Random random = new Random();
        int monthDays=30;
        int restDays=random.nextInt(4);
        int baseSalary = random.nextInt(1800000);

        employee.setSalary((baseSalary*(monthDays-restDays))/monthDays);
    }
}
