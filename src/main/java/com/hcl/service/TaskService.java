package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Task;
import com.hcl.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepo;
	
	public List<Task> findAll(){
		return taskRepo.findAll();
	}
	public Task findByID(Long id) {
		return taskRepo.getOne(id);
	}
	public void saveTask(Task t) {
		taskRepo.save(t);	
	}
	public void deleteTask(Long id) {
		taskRepo.deleteById(id);
	}
}
