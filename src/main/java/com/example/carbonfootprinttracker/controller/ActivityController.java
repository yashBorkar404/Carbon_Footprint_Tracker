package com.example.carbonfootprinttracker.controller;

import com.example.carbonfootprinttracker.model.Activity;
import com.example.carbonfootprinttracker.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping
    public ResponseEntity<?> addActivity(@RequestBody Activity activity) {
        Activity savedActivity = activityService.addActivity(activity);
        return ResponseEntity.ok(savedActivity);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getUserActivities(@PathVariable Long userId) {
        List<Activity> activities = activityService.getUserActivities(userId);
        return ResponseEntity.ok(activities);
    }

    @GetMapping("/user/{userId}/footprint")
    public ResponseEntity<?> getUserCarbonFootprint(@PathVariable Long userId) {
        double totalFootprint = activityService.calculateTotalCarbonFootprint(userId);
        return ResponseEntity.ok(totalFootprint);
    }
}

