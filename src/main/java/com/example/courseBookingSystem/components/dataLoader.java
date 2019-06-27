package com.example.courseBookingSystem.components;

import com.example.courseBookingSystem.models.Booking;
import com.example.courseBookingSystem.models.Course;
import com.example.courseBookingSystem.models.Customer;
import com.example.courseBookingSystem.repositories.BookingRepository;
import com.example.courseBookingSystem.repositories.CourseRepository;
import com.example.courseBookingSystem.repositories.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class dataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public dataLoader() {
    }

    public void run(ApplicationArguments args){
        Course yoga = new Course("yoga", "aberystwyth", 4);
        courseRepository.save(yoga);

        Course broga = new Course("broga", "abrowystwyth", 5);
        courseRepository.save(yoga);

        Customer customer1 = new Customer("Clive", "Bangor", 39);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Shelly", "Bradford", 21);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("16-05-21", yoga, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("16-04-21", yoga, customer2);
        bookingRepository.save(booking2);
    }
}
