package pro.sky.stringEmploeerProekt.service;

import org.springframework.stereotype.Service;
import pro.sky.stringEmploeerProekt.EmployeeNotFaundException.EmployeeAlreadyAddedException;
import pro.sky.stringEmploeerProekt.EmployeeNotFaundException.EmployeeNotFoundException;
import pro.sky.stringEmploeerProekt.model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service
public class EmloyeeServiceImpl implements EmployeeService {
    private final List<Employee> employeeList;

    public EmloyeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if(employeeList.contains(employee)){
            throw new EmployeeAlreadyAddedException();
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeList.remove(employee);
        return employee;
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException();
    }
    @Override
    public Collection<Employee> findAll(){
        return employeeList;
    }
}
