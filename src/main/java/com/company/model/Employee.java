package com.company.model;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

   // @NotNull  // -->>  Field should not be null
   // @NotEmpty // -->>  Field should not be ""    // NotBlank covers others
    @NotBlank // -->>  Field should not be "      "
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;

    //@NotNull
    // Thymeleaf accepts yyyy-MM-dd format
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    //@NotBlank
    //@Email
    private String email;
    //@NotBlank
    //@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;


}
