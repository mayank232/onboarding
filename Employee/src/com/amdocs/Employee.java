package com.amdocs;

public class Employee {

	
		
	 private String name;
	 private String designation;
	 private String department;
	 
	 private Address data = new Address();
	public Employee(String name, String designation, String department, String doorno, String street, String city) {
		
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.data.doorno = doorno;
		this.data.street = street;
		this.data.city = city;
	}

	
	 
	 public Employee() {
			
			
		}
	 
	 public static void main(String[] args) {

	}

	

}
