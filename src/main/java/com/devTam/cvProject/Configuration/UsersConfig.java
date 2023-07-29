package com.devTam.cvProject.Configuration;

import com.devTam.cvProject.Entity.Users;
import com.devTam.cvProject.Repository.UsersRepository;
import com.devTam.cvProject.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Configuration
public class UsersConfig {
    @Autowired
    UsersService usersService;
    @Bean
    CommandLineRunner commandLineRunnerForUser(UsersService usersService) {
        return args ->{
            Users tam = new Users(
                    "Nguyen Trong Tam",
                    "Java internship",
                    "I want to work for your company",
                    new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2002"),
                    "0328419491",
                    "nguyentrongtam2x2@gmail.com",
                    "github.com/devtam-02",
                    "Minh Khai, Bac Tu Liem",
                    "Male");
            Users nam = new Users(
                    "Hoang Duc Nam",
                    "PHP internship",
                    "I want to work for your company",
                    new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2002"),
                    "054369491",
                    "HoangNamdm@gmail.com",
                    "github.com/ducnam-hehe",
                    "Minh Khai, Bac Tu Liem",
                    "Male");

            usersService.saveUsers(tam);
            usersService.saveUsers(nam);


        };
    }
}
