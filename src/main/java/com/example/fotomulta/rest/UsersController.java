package com.example.fotomulta.rest;
import com.example.fotomulta.crudrepository.UsersRepository;
import com.example.fotomulta.dto.RequestUserDto;
import com.example.fotomulta.dto.ResponseUserDto;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.fotomulta.entity.Users;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/getUsers")
    public Iterable<Users> getUsers () {
        return usersRepository.findAll();
    }
    @PostMapping("/addUser")
    public Users addUsers(@RequestBody RequestUserDto reqUser){
        //aqui va user
        Users user = new Users();
        user.setName(reqUser.getName());
        user.setLastName(reqUser.getAddres());
        user.setCity(reqUser.getCity());
        user.setCel(reqUser.getCel());
        return  usersRepository.save(user);
    }
    @PutMapping("/editUser{id}")
    public Optional<Users> editUser(@RequestBody RequestUserDto req, @PathVariable Long id){
     return usersRepository.findById(id).map(users -> {
         //mañana continuamos aqui...
        users.setName(req.getName());
        users.setLastName(req.getLastName());

        return  usersRepository.save(users);
     });
    }

}
