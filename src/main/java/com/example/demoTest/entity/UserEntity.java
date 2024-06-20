package com.example.demoTest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class UserEntity {
    @Id
    int userId;
    @Column
    private String userName;
    @Column
    private String address;
    @Column
    private String email;
    @Column
    private String mobile;



}
