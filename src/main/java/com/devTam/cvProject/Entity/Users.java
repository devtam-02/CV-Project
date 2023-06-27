package com.devTam.cvProject.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public Users(String fullName, String jobTitle, String careerObjective, Date dateOfBirth, String phone, String email, String website, String address, String gender) {
		this.fullName = fullName;
		this.jobTitle = jobTitle;
		this.careerObjective = careerObjective;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
		this.website = website;
		this.address = address;
		this.gender = gender;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Award> awards;

}