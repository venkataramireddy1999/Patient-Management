package com.nonsyncbobbal.patientservice.mapper;

import com.nonsyncbobbal.patientservice.dto.PatientResponseDTO;
import com.nonsyncbobbal.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO  toPatientResponseDTO(Patient p) {
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO(
                p.getId().toString(),
                p.getName(),
                p.getAddress(),
                p.getBirthDate().toString()
        );
        return patientResponseDTO;
    }
}
