package record;

record Employee1(String name, double sal) {
    public Employee1 {
        if (sal < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        else if (sal > 20000) {
            System.out.println("You are eligible");
        }
        else {
            System.out.println("You are not eligible");
        }
    }
}

public class Employee {

    public static void main(String[] args) {

        Employee1 e = new Employee1("Hansi", 50000);
        System.out.println(e);

    }
}