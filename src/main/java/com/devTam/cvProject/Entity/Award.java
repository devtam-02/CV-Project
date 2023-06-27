package com.devTam.cvProject.Entity;

import lombok.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Award {

	private int id;
	private String name;
	private String organization;
	private String description;
	private int year;
}