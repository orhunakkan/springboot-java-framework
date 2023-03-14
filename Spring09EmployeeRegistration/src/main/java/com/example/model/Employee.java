package com.example.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    // @NotNull
    // @NotEmpty

    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;

    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private LocalDate birthday;

    private String email;
    private String password;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
