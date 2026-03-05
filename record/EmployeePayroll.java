
package record;

record EmployeePayrollRecord (float base_sal,double allowance,float tax) {
    public float netSalary(){
        return base_sal + (float)allowance - tax;
    }
}

public class EmployeePayroll{

    public static void main(String[] args) {

        EmployeePayrollRecord e = new EmployeePayrollRecord(50000, 5000, 5000);
        System.out.println(e.netSalary());

    }
}