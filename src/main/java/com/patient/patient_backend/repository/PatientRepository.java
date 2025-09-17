package com.patient.patient_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.patient.patient_backend.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // JpaRepository provides all basic CRUD methods automatically
}
