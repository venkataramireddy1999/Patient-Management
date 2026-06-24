package com.nonsyncbobbal.patientservice.controller;

import com.nonsyncbobbal.patientservice.dto.PatientRequestDTO;
import com.nonsyncbobbal.patientservice.dto.PatientResponseDTO;
import com.nonsyncbobbal.patientservice.service.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping
    public ResponseEntity<List<PatientResponseDTO>> getPatients() {

        return ResponseEntity.ok(patientService.getAllPatients());
    }
    @PostMapping
    public ResponseEntity<PatientResponseDTO> createPatient(@Valid @RequestBody
                                                                PatientRequestDTO patientRequestDTO) {
            return ResponseEntity.ok(patientService.createPatient(patientRequestDTO));

    }
}
