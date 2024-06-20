package com.example.demoTest.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Valid
public class User {

    int userId;
    @NotEmpty
    String userName;
    @NotEmpty
    String address;
    @NotEmpty
    String email;
    @NotEmpty
    String phone;
}
