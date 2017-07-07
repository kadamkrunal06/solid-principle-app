package com.techlabs.isp.violation;

public class Developer implements WorkEatable {

	@Override
	public void eat() {
		System.out.println("Developer iat Cafeteria");
	}

	@Override
	public void work() {
		System.out.println("Developer is Working");
	}

}
