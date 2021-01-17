package com.hcl.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
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

	@Autowired
	private UserService uService;

	@GetMapping(value = "login")
	public ModelAndView login() {
		User u = new User();
		return new ModelAndView("login", "user", u);
	}

	@PostMapping(value = "login")
	public String login(@Valid @ModelAttribute("user") User u, HttpSession session) {

		//User currentUser = new User();
		u = uService.loginValid(u.getEmail(), u.getPassword());
//		try {
//			
//		} catch (Exception e) {
//			currentUser = new User(777, "Nick", "n@mail.com", "pass");
//			e.printStackTrace();
//		}

		session.setAttribute("currentsess", u.getName());
		//session.setAttribute("currentUser", currentUser);

		return "redirect:/dashboard";

	}

	@GetMapping(value = "dashboard")
	public String dashboard(HttpSession session) {
		return "Dashboard";
	}
	@GetMapping(value = "logout")
	public String logout(HttpSession session) {
		session.invalidate();

		return "redirect:index";
	}
	// Not working, throwing null error
//	@PostMapping(value = "login")
//	public String login(@Validated @ModelAttribute("user") User u, HttpSession session) {
//		//User currentUser = new User();
//		u = uService.loginValid(u.getEmail(), u.getPassword());
//		System.out.println(u.toString());
//
//		session.setAttribute("currentUser", u);
//		return "/dashboard";
//
//	}
}
