package pro.sky.stringEmploeerProekt;
import java.util.ArrayList;
import java.util.List;
public class EmployeeService {
    // Константа для максимального количества сотрудников в фирме
    public static final int countMax = 10;

    // Коллекция сотрудников
    private List<Employee> employees;

    // Конструктор для инициализации коллекции сотрудников
    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    // Метод для добавления сотрудника в коллекцию
    public void addEmployee(Employee employee) {
        if (employees.size() < countMax) {
            employees.add(employee);
        } else {
            System.out.println("Максимальное количество сотрудников достигнуто!");
        }
    }

    // Метод для удаления сотрудника из коллекции
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // Метод для получения списка всех сотрудников
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Метод для поиска сотрудника по имени и фамилии
    public Employee findEmployeeByNameAndLastName(String firstName, String lastName) {
        for (Employee employee : employees) {
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                return employee;
            }
        }
        return null;
    }
}
