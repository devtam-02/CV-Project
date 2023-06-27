package com.devTam.cvProject.Controller;

import com.devTam.cvProject.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/home","","/"})
public class HomeController {
    @Autowired
    UsersService usersService;

    @GetMapping("")
    public String homePageViewing(){
        return "index";
    }

    @GetMapping("/getUsers")
    @ResponseBody
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok(usersService.getAllUsers());
    }
}
