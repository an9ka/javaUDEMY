package KeyHorstmann;
import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args){
        // Заполнить массив staff тремя объектами типа Employee
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 7009, 2012,2,12);
        staff[1] = new Employee("Harry Hacker", 5000, 2012,10,30);
        staff[2] = new Employee("Tony Tester", 4000, 2012,7,8);

        //поднять всем работникам зп на 5%
        for (Employee e : staff)
            e.raiseSalary(5);
        //поднять всем
        for (Employee e: staff)
            System.out.println();

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

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double bePercent){
        double raise = salary * bePercent / 100;
        salary += raise;
    }
}





