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
@Table(name = "Awards")
public class Award {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String organization;
	private String description;
	private int year;

//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	public Users users;
}