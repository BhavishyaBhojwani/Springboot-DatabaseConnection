package com.MySql.DatabaseConnection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;
@Column (name = "emp_name")
private float salary;

public Employee()
{
}

public Employee(int id, float salary) {
	super();
	this.id = id;
	this.salary = salary;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

}
