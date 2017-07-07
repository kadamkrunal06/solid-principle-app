package com.techlabs.dip.violation.refactor;

public class IncomeTaxCalculator {
	private ILogStrategy logStrategy;

	public IncomeTaxCalculator(ILogStrategy logStrategy) {
		this.logStrategy = logStrategy;
	}

	public int calculate(int income, int rate) {
		int tax = 0;

		try {
			tax = income / rate;
		} catch (Exception exception) {
			String message = exception.getMessage();
			logStrategy.log(message);

		}
		return tax;
	}
}