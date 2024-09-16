package com.example.Booking.service;

import com.example.Booking.entity.Booking;
import com.example.Booking.repo.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RestTemplate restTemplate; // For REST communication

    private static final String CUSTOMER_SERVICE_URL = "http://localhost:8081/api/customers/";

    public Booking saveBooking(Booking booking) {
        // Fetch customer details based on customerId
        Customer customer = restTemplate.getForObject(CUSTOMER_SERVICE_URL + booking.getCustomerId(), Customer.class);
        // Optionally, you can log the customer details or process them here
        // For example, if you only need the customer's name:
        // String customerName = customer.getName();

        return bookingRepository.save(booking);
    }
}