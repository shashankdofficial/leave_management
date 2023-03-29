package com.leavemanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Leaves {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long LeaveId;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "empId")
//	private Employee employee;
	
	@NotNull(message = "Date cannot be blank")
	private String to;
	
	@NotNull(message = "Date cannot be blank")
	private String from;
	
	private Boolean status = false;
//
//	public Leaves() {
//		super();
//	}
//
//	public Leaves(Long leaveId, Employee employee, @NotNull(message = "Date cannot be blank") String to,
//			@NotNull(message = "Date cannot be blank") String from, Boolean status) {
//		super();
//		LeaveId = leaveId;
//		this.employee = employee;
//		this.to = to;
//		this.from = from;
//		this.status = status;
//	}
//
//	public Long getLeaveId() {
//		return LeaveId;
//	}
//
//	public void setLeaveId(Long leaveId) {
//		LeaveId = leaveId;
//	}
//
//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
//
//	public String getTo() {
//		return to;
//	}
//
//	public void setTo(String to) {
//		this.to = to;
//	}
//
//	public String getFrom() {
//		return from;
//	}
//
//	public void setFrom(String from) {
//		this.from = from;
//	}
//
//	public Boolean getStatus() {
//		return status;
//	}
//
//	public void setStatus(Boolean status) {
//		this.status = status;
//	}
//
//	@Override
//	public String toString() {
//		return "Leaves [LeaveId=" + LeaveId + ", employee=" + employee + ", to=" + to + ", from=" + from + ", status="
//				+ status + "]";
//	}
	
	
	
}
