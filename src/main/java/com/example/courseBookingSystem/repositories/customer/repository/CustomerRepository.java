package com.example.courseBookingSystem.repositories.customer.repository;

import com.example.courseBookingSystem.models.Booking;
import com.example.courseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByCourseNameIn(List<Booking> bookings);
}
