package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Task;

@Controller
public class TaskController {
	

	@GetMapping(value="createtask")
	public ModelAndView createTask() {
		Task t = new Task();
		return new ModelAndView("CreateTask", "newTask", t);
	}
	@PostMapping(value="createtask")
	public String saveTask() {
		return"redirect:user/home";
	}
}
