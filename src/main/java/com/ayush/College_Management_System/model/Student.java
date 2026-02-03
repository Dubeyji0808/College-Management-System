package com.ayush.College_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studId;

    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dob;

    @Column(unique = true)
    private String rollNo;
    private String email;
    private String phone;
    private Integer currentSemester;
    private Integer admissionYear;
    private String status;
    private String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private Department department;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Attendance> attendanceRecords;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Fees> feeRecords;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Results> results;
}