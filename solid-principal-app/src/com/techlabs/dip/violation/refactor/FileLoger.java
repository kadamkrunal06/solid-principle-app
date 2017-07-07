package com.techlabs.dip.violation.refactor;

public class FileLoger implements ILogStrategy {

	@Override
	public void log(String message) {
		System.out.println("Logging in File" + message);
	}

}
