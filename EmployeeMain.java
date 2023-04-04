package org.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {


    public static void main(String[] args) {
        List<Employee> listOfEmployee = new ArrayList<Employee>();
        listOfEmployee.add(new Employee(101,"Rajesh kumar",25000.00,"9347639079","13-3-65","Hyderabad","India","500018","IT"));
        listOfEmployee.add(new Employee(109,"Nagesh kuruva",10000.00,"8897345102","11-9-A","Anantapur","India","534511","HR"));
        listOfEmployee.add(new Employee(104,"Anjineyulu",45000.00,"6301169536","13B-11","Srikakulam","India","500231","HR"));
        listOfEmployee.add(new Employee(111,"Satish prema",90000.00,"9866752832","90-B/11","Kurnool","India","598011","IT"));

        System.out.println("Sum of salaries of employees:"+listOfEmployee.stream().mapToDouble(Employee::getSalary).sum());

        System.out.println("Average  salaries of employees:"+listOfEmployee.stream().mapToDouble(Employee::getSalary).average());

        System.out.println("Employees salary greater than 30000");
        listOfEmployee.stream().filter(employee -> employee.getSalary()>30000).forEach(System.out::println);


        System.out.println("Employees names starts from A character");
        listOfEmployee.stream().filter(employee -> employee.getName().startsWith("A")).forEach(System.out::println);

        System.out.println("Sort the employees based on employee id");
        listOfEmployee.stream().sorted(Comparator.comparing(employee -> employee.getEmployeeId())).forEach(System.out::println);

        System.out.print("Employees with highest salary in the organization:");
        System.out.println(listOfEmployee.stream().max(Comparator.comparing(Employee::getSalary)).get().getName());

        System.out.println("Employee with low salary:"+listOfEmployee.stream().min(Comparator.comparing(Employee::getSalary)).get().getName());

        System.out.print("Second lowest salary:");
        listOfEmployee.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).limit(1).map(Employee::getName).forEach(System.out::println);

        System.out.print("Second highest salary:");
       listOfEmployee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).map(employee -> "Second highest salary "+employee.getName()+":"+employee.getSalary()).forEach(System.out::println);

       System.out.println("The below method will check the condition for all objects to be satisfied then returns boolean");
       System.out.println(listOfEmployee.stream().allMatch(employee -> employee.getName().startsWith("A")));

        System.out.println("The below method will check the condition for any objects to be satisfied then returns boolean");
        System.out.println(listOfEmployee.stream().anyMatch(employee -> employee.getName().startsWith("A")));

        System.out.println("The below method will check the condition for all objects none to be satisfied then returns boolean");
        System.out.println(listOfEmployee.stream().noneMatch(employee -> employee.getName().startsWith("X")));

        //  there are two more methods like takeWhile() which collects list until the condition failed then skips the elements
        //  there are two more methods like dropWhile() which collects list until the condition failed then collects the elements
        System.out.println("groupingBy and mapping methods example");
       System.out.println(listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList()))));
    }

}
