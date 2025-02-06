package com.example.carbonfootprinttracker.controller;

import com.example.carbonfootprinttracker.model.Offset;
import com.example.carbonfootprinttracker.service.OffsetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offsets")
public class OffsetController {

    @Autowired
    private OffsetService offsetService;

    @PostMapping
    public ResponseEntity<?> addOffset(@RequestBody Offset offset) {
        Offset savedOffset = offsetService.addOffset(offset);
        return ResponseEntity.ok(savedOffset);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getUserOffsets(@PathVariable Long userId) {
        List<Offset> offsets = offsetService.getUserOffsets(userId);
        return ResponseEntity.ok(offsets);
    }

    @GetMapping("/user/{userId}/total")
    public ResponseEntity<?> getUserTotalOffset(@PathVariable Long userId) {
        double totalOffset = offsetService.calculateTotalCarbonOffset(userId);
        return ResponseEntity.ok(totalOffset);
    }
}

