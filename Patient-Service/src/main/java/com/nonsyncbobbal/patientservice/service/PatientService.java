package com.nonsyncbobbal.patientservice.service;

import com.nonsyncbobbal.patientservice.dto.PatientResponseDTO;
import com.nonsyncbobbal.patientservice.mapper.PatientMapper;
import com.nonsyncbobbal.patientservice.model.Patient;
import com.nonsyncbobbal.patientservice.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    public List<PatientResponseDTO> getAllPatients() {
        List<Patient> Patients = patientRepository.findAll();
        List<PatientResponseDTO> patientResponseDTOs = Patients.stream()
                .map(PatientMapper::toPatientResponseDTO)
                .toList();
//        List<PatientResponseDTO> patientResponseDTOs = new ArrayList<>();
//        for(Patient p : Patients){
//            patientResponseDTOs.add(PatientMapper.toPatientResponseDTO(p));
//        }
        return patientResponseDTOs;
    }

}
