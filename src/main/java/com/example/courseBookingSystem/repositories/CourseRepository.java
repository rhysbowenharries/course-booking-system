package com.example.courseBookingSystem.repositories;

import com.example.courseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCoursesByRating(int rating);
}
