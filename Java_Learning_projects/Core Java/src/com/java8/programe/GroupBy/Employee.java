package com.java8.programe.GroupBy;

public class Employee {

	private int id;
	private String name;
	private String department;
	private boolean status;
	private int salary;
	private String sex;
	private int age;
	private String year;
	public Employee(int id, String name, String department, boolean status, int salary, String sex, int age,
			String year) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.status = status;
		this.salary = salary;
		this.sex = sex;
		this.age = age;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", status=" + status
				+ ", salary=" + salary + ", sex=" + sex + ", age=" + age + ", year=" + year + "]";
	}
	
	
	
	
	
}
