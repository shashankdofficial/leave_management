package com.leavemanagement.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
	
	@NotNull(message = "Name cannot be null")
    private String name;
	
    private int role = 2;
    
	@NotNull(message = "Department cannot be null")
    private String department;
	
	@NotNull(message = "Manager Name cannot be null")
    private String manager;
    
    @Email
    @Column(unique = true)
	@NotNull(message = "email cannot be null")
    private String email;
    
    @NotNull(message = "password cannot be null")
//	@JsonIgnore()
	@JsonProperty(access = Access.WRITE_ONLY)
	@Size(min = 5,max = 8,message = "password length should be between 5 & 8.")
    private String password;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employees",orphanRemoval = true)
	@JsonIgnore
    List<Leaves> leavesDetails = new ArrayList<>();
    
	public Employee() {
		super();
	}

    public Employee(Long empId, String name, int role, String department, String manager, String email,
			String password) {
		super();
		this.empId = empId;
		this.name = name;
		this.role = role;
		this.department = department;
		this.manager = manager;
		this.email = email;
		this.password = password;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long id) {
        this.empId = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getRole() {
		return role;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public List<Leaves> getLeavesDetails() {
		return leavesDetails;
	}

	public void setLeavesDetails(List<Leaves> leavesDetails) {
		this.leavesDetails = leavesDetails;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", role=" + role + ", department=" + department
				+ ", manager=" + manager + ", email=" + email + ", password=" + password + ", leavesDetails="
				+ leavesDetails + "]";
	}

}