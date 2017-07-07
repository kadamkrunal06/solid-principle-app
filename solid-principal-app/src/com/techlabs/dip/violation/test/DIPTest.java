package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.IncomeTaxCalculator;
import com.techlabs.dip.violation.LogType;

public class DIPTest {
	public static void main(String[] args) {

		IncomeTaxCalculator itc = new IncomeTaxCalculator(LogType.FILE);
		System.out.println(itc.calculate(0, 0));
	}
}