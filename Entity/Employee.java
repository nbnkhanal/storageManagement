package com.su.StorageUnit.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_data")
public class Employee {

	// @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

//	@Column(name = "first_name")
	private String firstName;
	private String department;
	private double salary;

	public Employee() {
	}
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", department=" + department + ", salary=" + salary
				+ "]";
	}

}
