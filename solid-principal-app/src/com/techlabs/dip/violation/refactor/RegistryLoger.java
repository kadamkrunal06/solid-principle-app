package com.techlabs.dip.violation.refactor;

public class RegistryLoger implements ILogStrategy {
	@Override
	public void log(String message) {
		System.out.println("Logging in Registry" + message);
	}

}
