package com.cursor.hw19.domain.repo;

import com.cursor.hw19.domain.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Integer> {

    List<Accounts> findByFirstName(String firstName);

    List<Accounts> findAll();

    @Query(value = "select first_name from accounts where id=:id", nativeQuery = true)
    String findFirstNameById(@Param("id") Integer id);
}
