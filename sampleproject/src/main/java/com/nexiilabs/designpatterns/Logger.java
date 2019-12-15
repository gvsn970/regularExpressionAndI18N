package com.nexiilabs.designpatterns;

public class Logger {

	private static Logger logger;
	
	private Logger() {
		
	}
	
	public static Logger getInstace() {
	
		if(logger == null) {
			logger=new Logger();
		}
		return logger;
	}
}
