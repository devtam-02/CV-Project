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
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "fullName")
	private String fullName;
	@Column(name = "jobTitle")
	private String jobTitle;
	@Column(name = "careerObjective")
	private String careerObjective;
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	@Column(name = "phone")
	private String phone;
	@Column(name = "email")
	private String email;
	@Column(name = "website")
	private String website;
	@Column(name = "address")
	private String address;
	@Column(name = "gender")
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

//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private UsersAwards usersAwards;

}