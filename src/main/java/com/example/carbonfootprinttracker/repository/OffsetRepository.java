package com.example.carbonfootprinttracker.repository;

import com.example.carbonfootprinttracker.model.Offset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OffsetRepository extends JpaRepository<Offset, Long> {
    List<Offset> findByUserId(Long userId);
}

