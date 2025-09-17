package com.patient.patient_backend.controller;

import com.patient.patient_backend.model.Patient;
import com.patient.patient_backend.service.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class PatientController {

    private final PatientService service;

   @PostMapping("/register")
public ResponseEntity<?> registerPatient(@Valid @RequestBody Patient patient) {
    System.out.println("📥 Incoming patient: " + patient);
    Patient saved = service.savePatient(patient);
    System.out.println("✅ Saved patient: " + saved);
    return ResponseEntity.status(HttpStatus.CREATED).body(saved);
}

}
