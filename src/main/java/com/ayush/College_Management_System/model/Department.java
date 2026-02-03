package com.ayush.College_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;

    @Column(nullable = false, unique = true)
    private String name;
    private String code;
    private String hodName;
    private String email;
    private String extensionNo;
    private LocalDate foundationDate;
    private Integer totalLabs;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Student> students;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Course> courses;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Faculty> facultyMembers;
}