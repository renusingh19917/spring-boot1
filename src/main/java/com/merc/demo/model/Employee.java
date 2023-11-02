package com.merc.demo.model;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {

	@Id // indicated PK column field
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;

	@Column(name = "first_name")
	@Length(min = 4, max = 20, message = "length should be 4 to 20 characters!")
	private String firstName;

	@Column(name = "salary")
	private Double salary;

	@ManyToOne
	@JoinColumn(name = "did")
	private Department department;

	public Employee() {
		super();
	}

	public Employee(Integer eid, String firstName, Double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	public Employee(Integer eid, String firstName, Double salary, Department department) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
		this.department = department;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + ", department=" + department
				+ "]";
	}

}



//package com.merc.demo.model;
//
////@Model
//public class Employee {
//
//	int empId;
//	String empName;
//	String empDept;
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public String getEmpDept() {
//		return empDept;
//	}
//	public void setEmpDept(String empDept) {
//		this.empDept = empDept;
//	}
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + "]";
//	}
//	public Employee(int empId, String empName, String empDept) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empDept = empDept;
//	}
//	
//	
//}
