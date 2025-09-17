package com.patient.patient_backend.service;

import org.springframework.stereotype.Service;
import com.patient.patient_backend.repository.PatientRepository;
import com.patient.patient_backend.model.Patient;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository repo;

    public Patient savePatient(Patient patient) {
        return repo.save(patient);
    }
}
