package com.javabytes.springh2demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	public int empId;
	public String empName;
	public String empDesignation;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empDesignation,String empName,int empId ) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empEmail) {
		this.empDesignation = empEmail;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empDesignation+ "]";
	}
	
	

}
