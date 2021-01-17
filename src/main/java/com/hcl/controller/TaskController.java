package com.hcl.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hcl.model.Task;
import com.hcl.service.TaskService;

@Controller
@RequestMapping(value = "task")
public class TaskController {
	
	@Autowired
	TaskService taskService = new TaskService();

	//Display
	@GetMapping(value="/display")
	public ModelAndView displayTask() 
	{
		List<Task> display = new ArrayList<Task>();
		display = taskService.findAll();
		
		return new ModelAndView("DisplayTasks", "taskList", display);
	}
	@PostMapping(value="/display")
	public String displayTask(@PathParam("id") String id, @PathParam("manage") String redirect, RedirectAttributes forward) 
	{

		if (redirect == "Delete") {
			forward.addAttribute("id", id);
			return "redirect:/task/delete/{id}";
		}
		else {
			forward.addAttribute("id", id);
			return "redirect:/task/update/{id}";
		}
	}
	
	//Create
	@GetMapping(value="/create")
	public ModelAndView createTask() 
	{
		Task t = new Task();
		return new ModelAndView("CreateTask", "newTask", t);
	}
	@PostMapping(value="/create")
	public String saveTask(@Valid @ModelAttribute("newTask") Task t, BindingResult bindingResult, 
			Model model) {
		
		taskService.saveTask(t);
		return"redirect:/dashboard";
	}
	
	//Delete
	@GetMapping(value="/delete/{id}")
	public ModelAndView deleteTask(@PathVariable("id") Long id) 
	{
		Task t = taskService.findByID(id);
		return new ModelAndView("DeleteTask", "task", t);
	}
	@PostMapping(value="/delete/")
	public String delete(@PathVariable("id") Long id) {
		
		taskService.deleteTask(id);
		return"redirect:/dashboard";
	}
	
	@GetMapping(value="/update/{id}")
	public ModelAndView updateTask(@PathVariable("id") Long id) 
	{
		Task t = taskService.findByID(id);
		return new ModelAndView("UpdateTask", "task", t);
	}
	@PostMapping(value="/update")
	public String updateTask(@Valid @ModelAttribute("newTask") Task t, BindingResult bindingResult, 
			Model model) {
		
		taskService.saveTask(t);
		return"redirect:/dashboard";
	}
}
