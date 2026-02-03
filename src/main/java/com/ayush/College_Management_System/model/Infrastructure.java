package com.ayush.College_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "infrastructure")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Infrastructure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assetId;

    private String roomOrLabName;
    private Integer floor;
    private String block;
    private Integer capacity;
    private Boolean hasProjector;
    private Integer noOfComputers;
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private Department department;
}