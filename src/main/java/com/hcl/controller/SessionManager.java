package com.hcl.controller;

import javax.servlet.http.HttpSession; 

public class SessionManager {
	
	public static String checkSession(HttpSession session) {
		Object s = session.getAttribute("currentsess");
		
		if (s.equals(null)) {
			return "redirect:/login";
		}
		else {
			return null;
		}
	}

}
