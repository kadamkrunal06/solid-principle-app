package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.*;

public class ISPTest {
	public static void main(String[] args) {
		atTheCafeteria(new Developer());
		atTheWork(new Robot());
		// atTheCafeteria(new Robot());
		atTheWork(new Developer());
	}

	public static void atTheCafeteria(Eatable eat) {
		System.out.println("At the cafeteria");
		eat.eat();
	}

	public static void atTheWork(Workable worker) {
		System.out.println("At the Work");
		worker.work();
	}
}
