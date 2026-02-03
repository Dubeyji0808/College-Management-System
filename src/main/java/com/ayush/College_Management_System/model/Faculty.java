package com.ayush.College_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "faculty")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facId;

    private String fullName;
    @Column(unique = true)
    private String employeeCode;
    private String designation;
    private String qualification;
    private LocalDate dateOfJoining;
    private Double salary;
    private String specialization;
    private String email;
    private String phone;
    private String cabinNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private Department department;

    @OneToMany(mappedBy = "faculty")
    private List<Subject> subjectsTaught;
}