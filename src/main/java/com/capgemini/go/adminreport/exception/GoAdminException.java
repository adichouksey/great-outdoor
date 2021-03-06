package com.capgemini.go.adminreport.exception;

public class GoAdminException extends Exception {

	private static final long serialVersionUID = 161032;

	public GoAdminException() {
	}

	public GoAdminException(String message) {
		super(message);
	}

	public GoAdminException(Throwable cause) {
		super(cause);
	}

	public GoAdminException(String message, Throwable cause) {
		super(message, cause);
	}

	public GoAdminException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}