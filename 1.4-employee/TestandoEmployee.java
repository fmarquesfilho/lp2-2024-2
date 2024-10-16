
public class TestandoEmployee {
    public static void main(String[] args) {
        Employee e = new Employee(3, "Rodolfo", 7500);
        System.out.println(e.toString());
        e.raiseSalary(10);
        System.out.println(e.toString());
    }
}
