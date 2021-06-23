package com.example.demo.security;

import java.util.Set;

import com.google.common.collect.Sets;

public enum AppRoles {

	STUDENT(Sets.newHashSet()),
	ADMIN(Sets.newHashSet(AppPermissions.STUDENT_READ, AppPermissions.STUDENT_WRITE,
			AppPermissions.COURSE_READ, AppPermissions.COURSE_WRITE
			));
	
	
	private final Set<AppPermissions> permissions;

	private AppRoles(Set<AppPermissions> permissions) {
		this.permissions = permissions;
	}

	public Set<AppPermissions> getPermissions() {
		return permissions;
	}
	
	
}
