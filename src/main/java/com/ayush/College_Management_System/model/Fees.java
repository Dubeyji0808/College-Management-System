package com.ayush.College_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "fees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feeId;

    private String transactionId;
    private String category;
    private Double totalAmount;
    private Double amountPaid;
    private LocalDate dueDate;
    private String paymentMode;
    private String paymentStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stud_id")
    private Student student;
}