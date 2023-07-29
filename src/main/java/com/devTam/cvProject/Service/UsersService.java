package com.devTam.cvProject.Service;

import com.devTam.cvProject.Entity.Users;
import com.devTam.cvProject.Repository.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    UsersRepository usersRepository;

    public ResponseEntity<?> getAllUsers(){
        return ResponseEntity.ok(usersRepository.findAll());
    }

    public void saveUsers(Users user){
        List<Users> users = usersRepository.findAllUsersByEmail(user.getEmail());
        if(users.isEmpty())
            usersRepository.save(user);
    }
    @Transactional
    public void updateUser(Users users){
        Users users1 =  usersRepository.findById(users.getId());
        users1 = users;
    }

    public Users findUserById(int id) {
        Users user = usersRepository.findById(id);
        return user;
    }
    public List<?> findUserInAward(int id){
        return usersRepository.findAll();
    }
}
