package com.cursor.hw19.domain.repo;

import com.cursor.hw19.domain.model.Profiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfilesRepository extends JpaRepository<Profiles, Integer> {

    List<Profiles> findByCompany(String company);

    List<Profiles> findAll();

    @Query(value = "select department from profiles where company=:company", nativeQuery = true)
    List<String> findDepartmentsByCompany(@Param("company") String company);
}
