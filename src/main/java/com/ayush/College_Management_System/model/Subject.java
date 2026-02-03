// Subject.java
package com.ayush.College_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "subjects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subId;

    private String subName;
    private String subCode;
    private String subType;
    private Integer credits;
    private Integer maxMarks;
    private Integer passingMarks;
    private Integer semesterNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;
}