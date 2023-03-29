package com.leavemanagement.entities;

public class LeavesDTO {

	private Long LeaveId;
	private Employee employee;
	private String to;
	private String from;
	
	public LeavesDTO() {
		super();
	}

	public LeavesDTO(Long leaveId, Employee employee, String to, String from) {
		super();
		LeaveId = leaveId;
		this.employee = employee;
		this.to = to;
		this.from = from;
	}

	public Long getLeaveId() {
		return LeaveId;
	}

	public void setLeaveId(Long leaveId) {
		LeaveId = leaveId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@Override
	public String toString() {
		return "LeavesDTO [LeaveId=" + LeaveId + ", employee=" + employee + ", to=" + to + ", from=" + from + "]";
	}
	
	
}
