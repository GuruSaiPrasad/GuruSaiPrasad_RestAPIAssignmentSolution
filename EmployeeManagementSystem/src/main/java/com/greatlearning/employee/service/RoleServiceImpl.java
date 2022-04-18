package com.greatlearning.employee.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.greatlearning.employee.model.Role;
import com.greatlearning.employee.repository.RoleRepository;

public class RoleServiceImpl implements RoleService {


	@Autowired
	RoleRepository roleRepository;

	@Override
	@Transactional
	public List<Role> findAll() {
		List<Role> roles = roleRepository.findAll();
		return roles;
	}

	@Override
	@Transactional
	public Optional<Role> findById(int theId) {
		return roleRepository.findById(theId);
	}

	@Override
	@Transactional
	public void save(Role theRole) {
		roleRepository.save(theRole);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		roleRepository.deleteById(theId);
	}

	@Override
	public Optional<Role> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
