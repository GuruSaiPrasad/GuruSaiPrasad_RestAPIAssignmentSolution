package com.greatlearning.employee.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.greatlearning.employee.model.Role;
import com.greatlearning.employee.model.User;

@SuppressWarnings("serial")
public class UserDetailService implements UserDetails {
	private User user;

	public UserDetailService(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<Role> roles = user.getListOfRoles();
		List<SimpleGrantedAuthority> authority = new ArrayList<>();
		for (Role role : roles) {
			authority.add(new SimpleGrantedAuthority(role.getName()));
		}
		return authority;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}