package com.devTam.cvProject.Entity;

import lombok.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

	private int id;
	private String fullName;
	private String jobTitle;
	private String careerObjective;
	private Date dateOfBirth;
	private String phone;
	private String email;
	private String website;
	private String address;
	private String gender;


}