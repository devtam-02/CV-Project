package com.devTam.cvProject.Controller;

import com.devTam.cvProject.Entity.Award;
import com.devTam.cvProject.Entity.Users;
import com.devTam.cvProject.Service.AwardService;
import com.devTam.cvProject.Service.UsersService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping({"/home","","/"})
public class HomeController {
    @Autowired
    UsersService usersService;

    @Autowired
    AwardService awardService;

    @Autowired
    EntityManager entityManager;


    @GetMapping("")
    public String homePageViewing(){
        return "index";
    }

    @GetMapping("/getUsers")
    @ResponseBody
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok(usersService.getAllUsers());
    }
    @PostMapping("/addUser")
    @ResponseBody
    public void addUser(@RequestBody Users user){
        usersService.saveUsers(user);
    }
    @GetMapping("/getUserAward/{id}")
    @ResponseBody
    public ResponseEntity<?> getUserAward(@PathVariable("id") int id){
        Users users = usersService.findUserById(id);
        if (Optional.of(users).isPresent())
            return ResponseEntity.ok(awardService.getAllAwardById(id));
        else
            return ResponseEntity.ok("Users with id " + id + " is not exist");
//        return ResponseEntity.ok("Users " + users.getFullName() + " khong ton tai award nao");
    }
    @GetMapping("/getAwardUsers/{id}")
    @ResponseBody
    public ResponseEntity<?> getUsersOfAward(@PathVariable("id") int id){
        Award award = awardService.findAwardById(id);
        if (Optional.of(award).isPresent())
            return ResponseEntity.ok(awardService.getAllUsersOfAward(id));
        else
            return ResponseEntity.ok("Award with id " + id + " is not exist");
    }
    @GetMapping("/getAward/{id}")
    @ResponseBody
    public ResponseEntity<?> getUsersAward(@PathVariable("id") int id){
        //Optional user = usersService.findUserById(id);
        Award award = awardService.findAwardById(id);
        if (Optional.of(award).isPresent())
            return ResponseEntity.ok(award);
        return ResponseEntity.ok("User with id " + id + " is not exist");
    }
    @GetMapping("/getAwards")
    @ResponseBody
    public ResponseEntity<?> getAwards(){
        return ResponseEntity.ok(awardService.getAllAward());
    }

    @PostMapping("/add")
    @ResponseBody
    public void addAwards(@RequestBody Award award){
        awardService.save(award);
    }

    @GetMapping("/getUserInAward/{id}")
    @ResponseBody
    public ResponseEntity<?> getUserInAward(@PathVariable("id") int id){
        List<?> usersList = usersService.findUserInAward(id);
        if (Optional.of(usersList).isPresent())
            return ResponseEntity.ok(usersList);
        return ResponseEntity.ok("User with id " + id + " is not exist");
    }

    @GetMapping("/getByEntityManager/{id}")
    @ResponseBody
    public ResponseEntity<?> getByEntityManager(@PathVariable("id") int id){
        return ResponseEntity.ok(entityManager.find(Users.class, id));
    }
    @PutMapping("/updateByEntityManager/{id}")
    @ResponseBody
    @Transactional
    public ResponseEntity<?> updateByEntityManager(@PathVariable("id") int id){
        Users users = entityManager.find(Users.class, id);

        users.setFullName("Nguyen Trong Tam Dep Trai vcl");

        entityManager.merge(users);
        return ResponseEntity.ok(users);
    }


}
