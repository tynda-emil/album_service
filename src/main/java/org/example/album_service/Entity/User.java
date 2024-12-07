package org.example.album_service.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id", nullable = false)
    private Long id;


    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "isverifiedartist", nullable = false)
    private Boolean isverifiedartist = false;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Boolean getIsverifiedartist() {
        return isverifiedartist;
    }
}