package org.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesByDepartment {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = new ArrayList<Employee>();
        listOfEmployee.add(new Employee(101, "Rajesh kumar", 25000.00, "9347639079", "13-3-65", "Hyderabad", "India", "500018","IT"));
        listOfEmployee.add(new Employee(109, "Nagesh kuruva", 10000.00, "8897345102", "11-9-A", "Anantapur", "India", "534511","HR"));
        listOfEmployee.add(new Employee(104, "Anjineyulu", 45000.00, "6301169536", "13B-11", "Srikakulam", "India", "500231","HR"));
        listOfEmployee.add(new Employee(111, "Satish prema", 90000.00, "9866752832", "90-B/11", "Kurnool", "India", "598011","IT"));

      listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).entrySet().forEach(stringLongEntry ->{ System.out.println(stringLongEntry.getKey()+":"+stringLongEntry.getValue());});
    }

}
