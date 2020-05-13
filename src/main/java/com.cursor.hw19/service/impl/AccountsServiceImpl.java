package com.cursor.hw19.service.impl;

import com.cursor.hw19.domain.model.Accounts;
import com.cursor.hw19.domain.repo.AccountsRepository;
import com.cursor.hw19.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    private AccountsRepository accountsRepository;

    public void findByFirstName(String firstName) {
        List<Accounts> byFirstName = accountsRepository.findByFirstName(firstName);
        System.out.println(byFirstName);
    }

    public void findAll() {
        List<Accounts> accountList = accountsRepository.findAll();
        System.out.println(accountList);
    }

    public void findFirstNameById(Integer id) {
        String firstName = accountsRepository.findFirstNameById(id);
        System.out.println("Id = " + id + ". First name = " + firstName + ".");

    }
}
