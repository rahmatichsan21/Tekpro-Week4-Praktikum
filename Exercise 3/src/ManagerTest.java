public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Managers("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        for (int i = 0; i < 3; i++) {
            if (staff[i] instanceof Managers) {
                ((Managers) staff[i]).raiseSalary(5); // Melakukan pengecekan apakah objek adalah instance dari Manager
            }
        }

        Sortable.shell_sort(staff, false); // Urutkan secara descending
        for (Employee e : staff) {
            e.print();
        }
    }
}
