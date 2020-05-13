package com.cursor.hw19.web.controller;

import com.cursor.hw19.service.impl.ProfilesServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@CrossOrigin
@RequestMapping("/api/profiles")
@AllArgsConstructor
@NoArgsConstructor
public class ProfilesController {
    @Autowired
    private ProfilesServiceImpl profileService;

    @GetMapping("/")
    @Autowired
    public void getData() {
        System.out.println("\n");

        profileService.findDepartmentsByCompany("Kare");

//        profileService.findByCompany("Skaboo");
//
//        profileService.findAll();

        System.out.println("\n");
    }
}
