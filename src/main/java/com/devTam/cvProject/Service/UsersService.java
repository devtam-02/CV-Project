package com.devTam.cvProject.Service;

import com.devTam.cvProject.Entity.Users;
import com.devTam.cvProject.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
}
