package com.fullstack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="emp_id")
    private int empId;
    @Column(name="emp_name")
    private String empName;
    @Column(name="emp_contact_number",unique=true)
    private long empContactNumber;
    @Column(name="emp_salary")
    private double empSalary;
    @Column(name="emp_email_id",unique = true)
    private String empEmailId;
    @Column(name="emp_password")
    private String empPassword;




}
