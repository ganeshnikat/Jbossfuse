/**
 * 
 */
package com.nttdata.techpro.dataformat;

import java.util.Date;

public class Employee {
    int employeeId;
    String employeeName;
    Date employeeJoiningDate;
    
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}
	public void setEmployeeJoiningDate(Date employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}
}