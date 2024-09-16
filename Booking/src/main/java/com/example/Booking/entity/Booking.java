package com.example.Booking.entity;

import jakarta.persistence.*;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookingDate;
    private String details;

    private Long customerId; // Store only the customer ID

    // Getters and Setters
}
