package com.example.hibernateonetoonemapping.Controller;

import com.example.hibernateonetoonemapping.Entity.Gender;
import com.example.hibernateonetoonemapping.Entity.User;
import com.example.hibernateonetoonemapping.Entity.UserProfile;
import com.example.hibernateonetoonemapping.Reposetory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
@RestController
@RequestMapping("/hi")
public class Cont {

    @Autowired
    private UserRepository userRepository;


    @GetMapping(value="")
    public void set()
    {
        User user=new User();
        user.setEmail("Alokiit14@gmail.com");
        user.setName("Alok");


        UserProfile up=new UserProfile();
        up.setAddress("London,sr,2323");
        up.setGender(Gender.MALE);
        up.setPhoneNumber("88534985093");
        up.setDateOfBirth(LocalDate.of(2022,9,9));
        user.setUserProfile( up);
        up.setUser(user);
        System.out.println("Data is saved now");
        userRepository.save(user);
    }
}
