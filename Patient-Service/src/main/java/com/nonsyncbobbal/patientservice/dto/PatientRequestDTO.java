package com.nonsyncbobbal.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record PatientRequestDTO(@NotBlank(message = "Name is required")
                                @Size(max =100, message = "Max characters allowed are 100")
                                String name,

                                @NotBlank(message = "Email is required")
                                @Email(message = "Email should be valid")
                                String email,

                                @NotBlank(message = "Address is required")
                                String address,

                                @NotBlank(message = "date of birth required")
                                String dateOfBirth,

                                @NotBlank(message = "Registered date is required")
                                String registeredDate){
}
