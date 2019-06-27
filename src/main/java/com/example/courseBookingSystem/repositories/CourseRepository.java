package com.example.courseBookingSystem.repositories;

import com.example.courseBookingSystem.models.Course;
import com.example.courseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCoursesByRating(int rating);

    List<Course> findCourseByBookings_CustomerId(Long id);


//    List<Customer> findCustomersByBookings_CourseId(Long id);


}
