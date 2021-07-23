public class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee() {
        id = 122;
        name = "Amar";
        department = "IT";
        salary = 20;
    }

    Employee(int id, String name, String department, double Salary) {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;

    }

    public static void main(String[] args) {
        System.out.println("HI this is main method");
    }
}