package KeyHorstmann;
import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args){
        // Заполнить массив staff тремя объектами типа Employee
        Employee[] staff = new Employee[3];
    }

}

class Employee {
    //поля экземпляра
    private String name;
    private double salary;
    private LocalDate hireDay;

    //Конструктор
    public  Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }
}





