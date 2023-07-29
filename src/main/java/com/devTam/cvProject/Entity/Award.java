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
@Table(name = "awards")
public class Award {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String organization;
	private String description;
	private int year;

	public Award(String name, String organization, String description, int year) {
		this.name = name;
		this.organization = organization;
		this.description = description;
		this.year = year;
	}

//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name = "users_id", unique = false)
//	public Users users;
}