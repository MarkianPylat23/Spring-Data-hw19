package com.cursor.hw19.web.controller;

import com.cursor.hw19.service.impl.AccountsServiceImpl;
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
@RequestMapping("/api/accounts")
@AllArgsConstructor
@NoArgsConstructor
public class AccountsController {
    @Autowired
    private AccountsServiceImpl accountsService;

    @GetMapping("/")
    @Autowired
    public void getData() {
        System.out.println("\n");

        accountsService.findFirstNameById(300);

//        accountService.findByFirstName("Mac");
//
//        accountService.findAll();

        System.out.println("\n");
    }
}
