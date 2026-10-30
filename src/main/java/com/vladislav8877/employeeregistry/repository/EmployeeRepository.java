package com.vladislav8877.employeeregistry.repository;

import com.vladislav8877.employeeregistry.model.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {
    private final Map<Integer, Employee> database = new HashMap<>();
    private int sequenceId = 1;

    public Employee save(String name, String position, double salary) {
        Employee employee = new Employee(sequenceId, name, position, salary);
        database.put(sequenceId, employee);
        sequenceId++;
        return employee;
    }

    public List<Employee> findAll() {
        return new ArrayList<>(database.values());
    }

    public Employee findById(int id) {
        return database.get(id);
    }

    public boolean deleteById(int id) {
        return database.remove(id) != null;
    }
}