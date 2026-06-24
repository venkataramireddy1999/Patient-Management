package com.nonsyncbobbal.patientservice.dto;

public record PatientResponseDTO(
        String id,
        String name,
        String address,
        String dateOfBirth) {

}
