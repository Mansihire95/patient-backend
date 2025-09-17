package com.patient.patient_backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "patients")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotNull
    @Min(0) @Max(150)
    private Integer age;

    @NotBlank
    private String gender;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Column(name = "phone_number", nullable = false)
   private String phoneNumber;

    private String address;

    @Column(length = 2000)
    private String medicalHistory;
}
