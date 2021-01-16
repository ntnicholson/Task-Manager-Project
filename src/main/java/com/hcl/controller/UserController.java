package com.hcl.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.hcl.model.User;
import com.hcl.service.UserService;

@Controller
@ControllerAdvice
public class UserController {

	private UserService uService;

	@GetMapping(value = "login")
	public ModelAndView login() {
		User u = new User();
		return new ModelAndView("login", "user", u);
	}

	@PostMapping(value = "login")
	public String login(@ModelAttribute("user") User u, HttpSession session) {
		User currentUser = uService.loginValid(u);

		if (currentUser != null) {
			session.setAttribute("currentUser", currentUser);
			return u.toString();
		} else {
			return u.toString();
		}
	}
	@GetMapping(value="logout")
	public String logout(HttpSession session) {
		session.invalidate();
	
		return "redirect:index";
	}
}
