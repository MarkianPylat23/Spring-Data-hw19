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
@Table(name = "accounts")
public class Accounts implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "city")
    private String city;

    @Column(name = "gender")
    private String gender;

    @Column(name = "username")
    private String username;

    @Column(name = "id", insertable = false, updatable = false, nullable = false)
    private int profileId;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    private Profiles profile;

    @Override
    public String toString() {
        return "\nAccount: " +
                "id = " + id +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", city = '" + city + '\'' +
                ", gender = '" + gender + '\'' +
                ", username = '" + username + '\'' +
                ", profileId = " + profileId +
                ", profile = " + profile;
    }
}
