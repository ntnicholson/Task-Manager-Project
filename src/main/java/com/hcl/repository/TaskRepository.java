package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>
{
}
