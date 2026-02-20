package com.ayush.College_Management_System.repository;
import com.ayush.College_Management_System.model.Results;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultsRepository extends JpaRepository<Results, Long> {
}