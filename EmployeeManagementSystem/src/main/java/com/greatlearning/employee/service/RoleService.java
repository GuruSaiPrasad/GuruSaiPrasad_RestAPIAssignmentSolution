package com.greatlearning.employee.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.employee.model.Role;

public interface RoleService {
	public List<Role> findAll();

	public Optional<Role> findById(int theId);

	public void save(Role theRole);

	public void deleteById(int theId);

	public Optional<Role> findByName(String name);
}
