package com.cursor.hw19.domain.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name = "profiles_table")
public class Profiles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "department")
    private String department;

    @Column(name = "company")
    private String company;

    @Column(name = "skill")
    private String skill;

    @Override
    public String toString() {
        return "\nProfile: " +
                "id = " + id +
                ", username = '" + username + '\'' +
                ", jobTitle = '" + jobTitle + '\'' +
                ", department = '" + department + '\'' +
                ", company = '" + company + '\'' +
                ", skill = '" + skill + '\'';
    }
}
