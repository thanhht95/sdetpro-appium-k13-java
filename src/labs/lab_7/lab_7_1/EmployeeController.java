package labs.lab_7.lab_7_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee();
        Employee contractEmployee = new ContractEmployee();
        int totalSalary = new EmployeeController().getTotalSalary(Arrays.asList(fullTimeEmployee,contractEmployee));
        System.out.println(totalSalary);
    }
    public int getTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
