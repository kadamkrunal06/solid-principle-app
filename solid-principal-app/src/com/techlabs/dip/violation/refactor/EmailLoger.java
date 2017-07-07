package com.techlabs.dip.violation.refactor;

public class EmailLoger implements ILogStrategy {

	@Override
	public void log(String message) {
		System.out.println("Logging in File" + message);
	}

}
