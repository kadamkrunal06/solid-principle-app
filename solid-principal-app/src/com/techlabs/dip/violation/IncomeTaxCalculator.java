package com.techlabs.dip.violation;

public class IncomeTaxCalculator {
	public LogType logType;
	private int tax;

	public IncomeTaxCalculator(LogType logType) {
		this.logType = logType;
	}

	public int calculate(int income, int rate) {
		try {
			tax = income / rate;
		} catch (Exception exception) {
			String errmsg = exception.getMessage();
			if (logType == LogType.EMAIL) {
				new EmailLoger().log(errmsg);
			} else if (logType == LogType.FILE) {
				new FileLoger().log(errmsg);
			} else if (logType == LogType.REGISTRY) {
				new RegistryLoger().log(errmsg);
			}
		}
		return tax;

	}
}
