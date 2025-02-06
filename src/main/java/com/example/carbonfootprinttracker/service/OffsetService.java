package com.example.carbonfootprinttracker.service;

import com.example.carbonfootprinttracker.model.Offset;
import com.example.carbonfootprinttracker.repository.OffsetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffsetService {

    @Autowired
    private OffsetRepository offsetRepository;

    public Offset addOffset(Offset offset) {
        return offsetRepository.save(offset);
    }

    public List<Offset> getUserOffsets(Long userId) {
        return offsetRepository.findByUserId(userId);
    }

    public double calculateTotalCarbonOffset(Long userId) {
        List<Offset> offsets = offsetRepository.findByUserId(userId);
        return offsets.stream()
                .mapToDouble(Offset::getCarbonOffset)
                .sum();
    }
}

