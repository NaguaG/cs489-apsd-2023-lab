package org.example;

import com.sun.tools.javac.util.List;
import lombok.var;
import org.example.modules.Employee;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        var employees = List.of(
                new Employee(1L, "Daniel", "Agar", LocalDate.of(2018,1,17), 105945.50, "EX1089", LocalDate.of(2023,1,17), 100.00),
                new Employee(2L, "Bernard", "Shaw", LocalDate.of(2018,10,3), 197750.50, null, null, null),
                new Employee(3L, "Carly", "Agar", LocalDate.of(2014,5,16), 842000.75, "SM2307", LocalDate.of(2019,11,4), 1555.50),
                new Employee(4L, "Wesley", "Schneider", LocalDate.of(2018,11,2), 74500.00, null, null, null)
        );
        printUpcomingEmployees(employees);
    }
    private static void printAllEmployees(List<Employee> employees){
        employees.stream().sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getYearlySalary, Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
    private static void printUpcomingEmployees(List<Employee> employees){
        employees.stream().sorted(Comparator.comparing(Employee::getLastName))
                .filter(Employee::isUpcomingEnrollee)
                .forEach(System.out::println);
    }
}
