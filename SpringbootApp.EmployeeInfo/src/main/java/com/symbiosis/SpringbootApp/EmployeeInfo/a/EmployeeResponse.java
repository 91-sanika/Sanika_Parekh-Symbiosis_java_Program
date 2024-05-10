package com.symbiosis.SpringbootApp.EmployeeInfo.a;

public class EmployeeResponse {

	private int Status;
	
	private String Message;
	
	private long TimeStamp;

	public EmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeResponse(int status, String message, long timeStamp) {
		super();
		Status = status;
		Message = message;
		TimeStamp = timeStamp;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public long getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		TimeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "EmployeeResponse [Status=" + Status + ", Message=" + Message + ", TimeStamp=" + TimeStamp + "]";
	}
	
}
