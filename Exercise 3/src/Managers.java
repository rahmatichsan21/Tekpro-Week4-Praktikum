import java.util.Calendar;
import java.util.GregorianCalendar;

public class Managers extends Employee implements Sortable {
    private String secretaryName;

    public Managers(String n, double s, int day, int month, int year) {
        super(n, s, day, month, year);
        secretaryName = "";
    }

    public void raiseSalary(double byPercent) {
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    @Override
    public int compare(Sortable b) {
        if (b instanceof Employee) {
            Employee eb = (Employee) b;
            if (this.getSalary() < eb.getSalary()) return -1;
            if (this.getSalary() > eb.getSalary()) return 1;
        }
        return 0;
    }


    // Override getSalary() to access salary
    @Override
    public double getSalary() {
        return super.getSalary();
    }
}
