package com.cursor.hw19.service.impl;

import com.cursor.hw19.domain.model.Profiles;
import com.cursor.hw19.domain.repo.ProfilesRepository;
import com.cursor.hw19.service.ProfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfilesServiceImpl implements ProfilesService {


    @Autowired
    private
    ProfilesRepository profileRepository;

    public void findByCompany(String company) {
        List<Profiles> profileList = profileRepository.findByCompany(company);
        System.out.println(profileList);
    }

    public void findAll() {
        List<Profiles> profileList = profileRepository.findAll();

        System.out.println(profileList);
    }

    public void findDepartmentsByCompany(String company) {
        List<String> departments = profileRepository.findDepartmentsByCompany(company);

        System.out.println("The company '" + company + "' has: " + departments + " department(s).");
    }
}
