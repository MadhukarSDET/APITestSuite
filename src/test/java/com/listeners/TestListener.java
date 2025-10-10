package com.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(TestListener.class);

	public void onStart(ITestContext context) {
		logger.info("Test Suite Execution Started: {}", context.getName());
	}

	public void onFinish(ITestContext context) {
		logger.info("Test Suite Execution Completed: {}", context.getName());
	}

	public void onTestStart(ITestResult result) {
		logger.info("Test Started: {}", result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Test Passed: {}", result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		logger.info("Test Failed: {}", result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		logger.info("Test Skilled: {}", result.getMethod().getMethodName());
	}

}
