package md.tekwill.service;

import md.tekwill.dao.EmployeeDao;
import md.tekwill.domain.Employee;

public class EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDao();

    public boolean create(Employee employee) {
        if (employee.getName().length() > 0) {
            employeeDao.create(employee);
            return true;
        }
        System.out.println("Employee validation failed!");
        return false;
    }

    public void listEmployees() {
        for (Employee employee : employeeDao.getAll()) {
            if (employee != null) {
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Last name: " + employee.getLastName());
            }
        }
    }
}

