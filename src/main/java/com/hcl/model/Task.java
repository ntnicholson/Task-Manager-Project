package com.hcl.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Task")
public class Task 
{
	@Id @GeneratedValue
	private Long id;
	private String name;
	private Date startDate;
	private Date endDate;
	private String description;
	private String email;
	private String severity;
	
	
	
	
	
	
}
