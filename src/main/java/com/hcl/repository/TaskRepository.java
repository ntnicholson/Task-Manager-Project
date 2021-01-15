package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
