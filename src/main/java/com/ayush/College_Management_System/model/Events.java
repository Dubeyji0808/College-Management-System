package com.ayush.College_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "events")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    private String eventTitle;
    private String organizer;
    private String venue;
    private LocalDateTime dateTime;
    private String guestName;
    private Double budgetAllocated;
    private Integer participantsCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private Department department;
}