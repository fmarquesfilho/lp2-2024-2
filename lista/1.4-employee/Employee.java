public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return 12 * getSalary();
    }

    public int raiseSalary(int percent) {
        int newSalary =  (getSalary() + (getSalary() * percent)) / 10;
        this.salary = newSalary;
        return newSalary;
    }

    public String toString() {
        String s = "Empregado " +
        "id = " + this.id +
        ", nome = " + this.name +
        ", salário = " + this.salary;

        return s;        
    }
}
