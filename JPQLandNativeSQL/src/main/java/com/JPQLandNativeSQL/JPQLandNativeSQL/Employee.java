package com.JPQLandNativeSQL.JPQLandNativeSQL;

import jakarta.persistence.*;

@Entity
@Table(name="employeeTable")
public class Employee {
    @Id
    @Column(name = "empId")
    int id;
    @Column(name="empFirstName")
    String firstName;
    @Column(name="empLastName")
    String lastName;
    @Column(name="empSalary")
    int salary;
    @Column(name="empAge")
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary( int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
