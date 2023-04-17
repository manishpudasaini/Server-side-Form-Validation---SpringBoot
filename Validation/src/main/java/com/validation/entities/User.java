package com.validation.entities;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @NotBlank(message = "Username cann't be empty!!!")
    @Size(min = 4,max = 30 , message = "Username should must be between 4 to 30")
    private String username;


    @NotBlank(message = "Password cann't be empty!!!")
    @Size(min = 4,max = 15 , message = "Username should must be between 6 to 15")
    private String password;
}
