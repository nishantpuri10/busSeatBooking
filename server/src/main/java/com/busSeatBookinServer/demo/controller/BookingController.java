package com.busSeatBookinServer.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busSeatBookinServer.demo.model.Booking;

@RequestMapping("/api/schedules")
@RestController
@CrossOrigin(origins = "*")
public class BookingController {

    ResponseEntity<List<Booking>> addBooking()
}
