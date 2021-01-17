package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Task;
import com.hcl.service.TaskService;

@Controller
@RequestMapping(value = "task")
public class TaskController {
	
	TaskService taskService = new TaskService();

	@GetMapping(value="/create")
	public ModelAndView createTask() {
		Task t = new Task();
		return new ModelAndView("CreateTask", "newTask", t);
	}
	@PostMapping(value="/create")
	public String saveTask(@ModelAttribute("newTask") Task t) {
		
		taskService.saveTask(t);
		return"redirect:/dashboard";
	}
}
