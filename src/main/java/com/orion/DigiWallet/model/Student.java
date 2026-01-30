package com.orion.DigiWallet.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    private String email;

    private LocalDateTime joiningDate;
//    private LocalDateTime passingDate;

    @Transient
    private String tempaddress;

    @PrePersist
    public void onPrePersist() {
        this.joiningDate = LocalDateTime.now();
    }

//    public void onPreUpdate() {
//        this.passingDate = LocalDateTime.now();
//    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public String getTempaddress() {
        return tempaddress;
    }

    public void setTempaddress(String tempaddress) {
        this.tempaddress = tempaddress;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getJoiningDate() {
        return joiningDate;
    }
    public void setJoiningDate(LocalDateTime joiningDate) {
        this.joiningDate = joiningDate;
    }

}
