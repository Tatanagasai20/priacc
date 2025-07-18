package com.example.backend.model;

public class LeaveRequest {
    private String employeeId;
    private String leaveType;
    private String startDate;
    private String endDate;

    public String getEmployeeId() {
        return employeeId;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}

