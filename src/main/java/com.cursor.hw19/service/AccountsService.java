package com.cursor.hw19.service;

import org.springframework.stereotype.Service;

@Service
public interface AccountsService {
    void findByFirstName(String firstName);

    void findAll();

    void findFirstNameById(Integer id);
}
