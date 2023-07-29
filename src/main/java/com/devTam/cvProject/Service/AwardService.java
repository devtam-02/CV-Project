package com.devTam.cvProject.Service;

import com.devTam.cvProject.Entity.Award;
import com.devTam.cvProject.Entity.Users;
import com.devTam.cvProject.Entity.UsersAwards;
import com.devTam.cvProject.Repository.AwardRepository;
import com.devTam.cvProject.Repository.UsersAwardsRepository;
import com.devTam.cvProject.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AwardService {
    @Autowired
    AwardRepository awardRepository;

    @Autowired
    UsersAwardsRepository usersAwardsRepository;
    @Autowired
    private UsersRepository usersRepository;

    public List<Award> getAllAward(){
        return awardRepository.findAll();
    }

    public void save(Award award) {
        awardRepository.save(award);
    }
    public Award findAwardById(int id){
        return awardRepository.findById(id);
    }
    public List<Award> getAllAwardById(int id){
        List<UsersAwards> usersAwards = usersAwardsRepository.findAllByUserId(id);
        List<Award> awards = new ArrayList<>();
        for (UsersAwards a: usersAwards) {
            awards.add(awardRepository.findById(a.getAwards().getId()));
        }
        return awards;
    }
    public List<Users> getAllUsersOfAward(int id){
        List<UsersAwards> usersAwards = usersAwardsRepository.findAllByAwardId(id);
        List<Users> users = new ArrayList<>();
        for (UsersAwards a: usersAwards) {
            users.add(usersRepository.findById(a.getUsers().getId()));
        }
        return users;
    }

}
