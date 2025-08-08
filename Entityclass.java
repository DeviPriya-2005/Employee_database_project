package com.example.DeviDB.EntityDB;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Entityclass {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="emp_id")
	private int E_id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_location")
	private String location;
	@Column(name="emp_role")
	private String role;
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
