package com.busSeatBookinServer.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busSeatBookinServer.demo.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> addBooking()
}
