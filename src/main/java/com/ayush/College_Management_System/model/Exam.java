package com.ayush.College_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "exams")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examId;

    private String examType;
    private String session;
    private LocalDate examDate;
    private String roomNumber;
    private Integer maxMarks;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_id")
    private Subject subject;

    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL)
    private List<Results> results;
}