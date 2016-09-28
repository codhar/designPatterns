package com.mainClasses;

import com.logger.AbstractLogger;
import com.logger.ConsoleLogger;
import com.logger.ErrorLogger;
import com.logger.FileLogger;

public class ChainPatternDemo {
	
	private static AbstractLogger getChainOfLogger(){
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;


	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = ChainPatternDemo.getChainOfLogger();
		
		loggerChain.logMessage(AbstractLogger.INFO,"This is information");
		loggerChain.logMessage(AbstractLogger.DEBUG,"this is debug message");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is error message");
	}

}
