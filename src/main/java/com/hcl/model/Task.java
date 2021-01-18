package com.hcl.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Task")
public class Task
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate endDate;
	private String description;
	private String email;
	private String severity;
	
	public Task(String name, LocalDate startDate, LocalDate endDate, String description, String email, String severity) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
		this.email = email;
		this.severity = severity;
	}
	
	
	
	
	
	
	
	
}
