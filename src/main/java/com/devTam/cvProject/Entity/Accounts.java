package com.devTam.cvProject.Entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Accounts {
	private int id;
	private String userName;
	private String password;
	private String phone;
	private String email;

}