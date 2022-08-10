package md.tekwill.ui;

import md.tekwill.domain.Employee;
import md.tekwill.service.EmployeeService;

public class TestEmployee {
    public static void main(String[] args){
        EmployeeService employeeService= new EmployeeService();
        Employee employee = new Employee("Ion","Bostan");
        Employee employee2 = new Employee("Vasile","Grosu");
        boolean isEmployeeSaved=employeeService.create(employee);
        employeeService.create(employee2);
        employeeService.listEmployees();
       // System.out.println(isEmployeeSaved);



    }
}
