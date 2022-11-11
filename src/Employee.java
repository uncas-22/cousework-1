public class Employee {
    private static int count = 0;
    private String fullName;
    private int departament;
    private double salary;
    private int id;

    public Employee( String fullName, int departament, double salary) {
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
        count++;
        id = count;

    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartament() {
        return departament;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }


}
