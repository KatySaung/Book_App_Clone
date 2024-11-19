package org.example.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message ="Firstname is required")
    @NotBlank(message ="Firstname is required")
    private String firstName;
    @NotEmpty(message ="Lastname is required")
    @NotBlank(message ="Lastname is required")
    private String lastName;
    @Email(message= "Email is not in correct format")
    @NotEmpty(message ="Email is required")
    @NotBlank(message ="Email is required")
    private String email;
    @NotEmpty(message ="Password is required")
    @NotBlank(message ="Password is required")
    private String password;

}
