package pro.sky.stringEmploeerProekt.model;


import java.util.Objects;

public class Employee {
    private String firstName;//доступны только внутри класса Employeer
    private String lastName;

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        // Это конструктор класса Employee, который принимает два параметра firstName и lastName типа String. Он инициализирует приватные поля firstName и lastName значениями, переданными в конструктор. Конструктор вызывается при создании нового объекта класса Employee.
    }
    public String getFirstName() {

        return firstName;
    }
    public String getLastName() {
        return lastName;
        //Это два метода доступа, которые возвращают значения приватных полей firstName и lastName соответственно. Они называются геттерами, потому что они возвращают значения полей.
    }

    @Override
    public boolean equals(Object o) { //проверяет, равны ли два объекта Employee
        if (this == o) return true;// если объект, с которым сравниваем, является тем же самым объектом, что и текущий объект, то возвращаем true
        if (!(o instanceof Employee)) return false;//если объект, с которым сравниваем, является null или не является объектом класса Employee, то возвращаем false.
        Employee employee = (Employee) o;//преобразуем объект, с которым сравниваем, в объект класса Employee.
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);// возвращаем true, если имена и фамилии двух объектов равны, и false в противном случае.
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);//возвращает хеш-код объекта Employee. Хеш-код - это уникальное целое число, которое может быть использовано для сравнения объектов.
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}'; //возвращает хеш-код объекта Employee. Хеш-код - это уникальное целое число, которое может быть использовано для сравнения объектов.
    }
}