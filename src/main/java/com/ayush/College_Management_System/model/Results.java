package com.ayush.College_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "results")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Results {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resId;

    private Double marksObtained;
    private Double internalMarks;
    private Double externalMarks;
    private String gradePoint;
    private String status;
    private Integer attemptNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stud_id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exam_id")
    private Exam exam;
}