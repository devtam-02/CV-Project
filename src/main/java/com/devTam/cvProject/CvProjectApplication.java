package com.devTam.cvProject;

import com.devTam.cvProject.Repository.UsersRepository;
import com.devTam.cvProject.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CvProjectApplication {


	public static void main(String[] args) {
		SpringApplication.run(CvProjectApplication.class, args);
	}

}
