package com.ayush.College_Management_System.repository;
import com.ayush.College_Management_System.model.Fees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeesRepository extends JpaRepository<Fees, Long> {
}