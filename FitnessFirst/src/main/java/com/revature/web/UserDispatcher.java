package com.revature.web;

import javax.servlet.http.HttpServletRequest;

public class UserDispatcher {
	
	
	private boolean performGet(HttpServletRequest request) {
		if (request.getMethod().equals("GET")){
			return true;
		} else {
			return false;
		}
	}
	
	private boolean performPost(HttpServletRequest request) {
		if (request.getMethod().equals("POST")) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean performPut(HttpServletRequest request) {
		if (request.getMethod().equals("PUT")) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean performDelete(HttpServletRequest request) {
		if (request.getMethod().equals("DELETE")) {
			return true;
		} else {
			return false;
		}
	}
	

	
}
