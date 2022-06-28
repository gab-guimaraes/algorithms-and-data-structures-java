package org.johnwick182.arrays.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(20);
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(System.out::println);

        int[] numbers = { 123 };
        Arrays.stream(numbers).forEach(System.out::println);

        for (int num : numbers) {
            System.out.println(num);
        }


    }
}
