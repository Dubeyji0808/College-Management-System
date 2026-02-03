// Course.java
package com.ayush.College_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String courseTitle;
    private String stream;
    private Integer totalSemesters;
    private Integer durationYears;
    private Integer minCredits;
    private String level;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private Department department;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Subject> subjects;
}