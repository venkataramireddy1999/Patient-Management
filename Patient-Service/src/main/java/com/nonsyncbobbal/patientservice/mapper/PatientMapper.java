package com.nonsyncbobbal.patientservice.mapper;

import com.nonsyncbobbal.patientservice.dto.PatientRequestDTO;
import com.nonsyncbobbal.patientservice.dto.PatientResponseDTO;
import com.nonsyncbobbal.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO  toPatientResponseDTO(Patient patient) {
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO(
                patient.getId().toString(),
                patient.getName(),
                patient.getAddress(),
                patient.getDateOfBirth().toString()
        );
        return patientResponseDTO;
    }
    public static Patient toPatient(PatientRequestDTO patientRequestDTO) {
        Patient patient = new Patient();
        patient.setName(patientRequestDTO.name());
        patient.setEmail(patientRequestDTO.email());
        patient.setAddress(patientRequestDTO.address());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.dateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.registeredDate()));
        return patient;
    }
}
