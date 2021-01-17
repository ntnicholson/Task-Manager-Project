package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Task;
import com.hcl.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepo;
	
	public Task saveTask(Task t) {
		
		return taskRepo.save(t);	
	}
}
