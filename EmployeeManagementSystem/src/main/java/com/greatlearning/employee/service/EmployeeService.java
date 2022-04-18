package com.greatlearning.employee.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.employee.model.Employee;
import com.greatlearning.employee.model.Role;
import com.greatlearning.employee.model.User;

public interface EmployeeService {
	public List<Employee> findAll();

	public Optional<Employee> findById(int theId);

	public String save(Employee theEmployee);

	public String updateEmployee(Employee theEmployee);

	public String deleteById(int theId);

	public List<Employee> searchByFirstName(String firstName);

	public List<Employee> sortByFirstName(String sortBy);

	public User saveUser(User user);

	public Role saveRole(Role role);
}
