package com.devTam.cvProject.Entity;

import lombok.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Education {

	private int id;
	private String organization;
	private Date start;
	private Date end;
	private String major;
	private float gpa;


}