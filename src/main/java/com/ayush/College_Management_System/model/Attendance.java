package com.ayush.College_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Attendance Entity - Tracks daily student presence per subject.
 * Using Lombok @Data to handle Getters, Setters, toString, and Equals/HashCode.
 */
@Entity
@Table(name = "attendance")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attId;

    @Column(nullable = false)
    private LocalDate lectureDate;

    private LocalTime startTime;
    private LocalTime endTime;

    @Column(nullable = false)
    private String status; // Present, Absent, Medical Leave

    private String remarks;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stud_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_id", nullable = false)
    private Subject subject;
}