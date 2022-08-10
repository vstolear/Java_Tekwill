package md.tekwill.dao;

import md.tekwill.domain.Employee;

public class EmployeeDao {
    private static Employee[] employeesArr = new Employee[10];

    public void create(Employee employee) {
        for (int i = 0; i < employeesArr.length; i++) {
            Employee existingEmployee = employeesArr[i];
            if (existingEmployee == null) {
                employeesArr[i] = employee;
                break;
            }
        }

        public Employee read(int employeeId){
            //search employee by id
            return null;
        }
        public void update(int employeeId, Employee updateEmployee){
            //search employee by id
            // update data from updateEmployee to the old employee from employeesArr
        }
        public void delete(int employeeId){
            // search employee by id
            //set to null

        }
    }
    public Employee[] getAll(){
        return employeesArr;
    }
}

