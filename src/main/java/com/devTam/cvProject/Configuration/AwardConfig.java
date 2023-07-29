package com.devTam.cvProject.Configuration;

import com.devTam.cvProject.Entity.Award;
import com.devTam.cvProject.Entity.Users;
import com.devTam.cvProject.Entity.UsersAwards;
import com.devTam.cvProject.Repository.UsersAwardsRepository;
import com.devTam.cvProject.Repository.UsersRepository;
import com.devTam.cvProject.Service.AwardService;
import com.devTam.cvProject.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AwardConfig {
    @Autowired
    AwardService awardService;

    @Autowired
    UsersAwardsRepository usersAwardsRepository;

    @Autowired
    UsersService usersService;

    @Bean
    CommandLineRunner commandLineRunnerForAward(AwardService awardService){
        return args -> {
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

            Award award1 = new Award("Tin Hoc Tre", "THPT Ha Huy Tap", "A2K18", 2020);
            Award award2 = new Award("HSG Tinh Tin Hoc", "THPT Ha Huy Tap", "A2K18", 2019);
            awardService.save(award1);
            awardService.save(award2);

            UsersAwards u1 = new UsersAwards(usersService.findUserById(1), awardService.findAwardById(1));
            usersAwardsRepository.save(u1);
            usersAwardsRepository.save(new UsersAwards(usersService.findUserById(1), awardService.findAwardById(2)));
            usersAwardsRepository.save(new UsersAwards(usersService.findUserById(2), awardService.findAwardById(2)));
        };
    }


}
