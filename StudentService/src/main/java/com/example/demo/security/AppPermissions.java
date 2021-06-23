package com.example.demo.security;

public enum AppPermissions {

	STUDENT_READ("student:read"),
	STUDENT_WRITE("student:write"),
	
	COURSE_READ("course:read"),
	COURSE_WRITE("course:write");
	
	private final String permission;

	AppPermissions(String permission) {
		this.permission=permission;
	}

	public String getPermission() {
		return permission;
	}
	
	
}
