package com.devTam.cvProject.Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@Entity
//@Table(name = "accounts")
public class Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String password;
	private String phone;
	private String email;

//	public Accounts(String userName, String password, String phone, String email, Users users) {
//		this.userName = userName;
//		this.password = password;
//		this.phone = phone;
//		this.email = email;
//		this.users = users;
//	}

//	@OneToOne
//	@JoinColumn(name="idUser", referencedColumnName ="id")
//	private Users users;
}