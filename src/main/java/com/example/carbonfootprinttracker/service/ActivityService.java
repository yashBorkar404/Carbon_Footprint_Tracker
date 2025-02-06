package com.example.carbonfootprinttracker.service;

import com.example.carbonfootprinttracker.model.Activity;
import com.example.carbonfootprinttracker.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public Activity addActivity(Activity activity) {
        // Here you would add logic to calculate the carbon footprint based on the activity
        // For simplicity, we're just saving the activity as is
        return activityRepository.save(activity);
    }

    public List<Activity> getUserActivities(Long userId) {
        return activityRepository.findByUserId(userId);
    }

    public double calculateTotalCarbonFootprint(Long userId) {
        List<Activity> activities = activityRepository.findByUserId(userId);
        return activities.stream()
                .mapToDouble(Activity::getCarbonFootprint)
                .sum();
    }
}

