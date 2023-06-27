package com.devTam.cvProject.Entity;

import lombok.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class WorkExperience {

	private int id;
	private String position;
	private String organization;
	private String description;
	private Date start;
	private Date end;

}