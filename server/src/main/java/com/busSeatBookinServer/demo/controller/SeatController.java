package com.busSeatBookinServer.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busSeatBookinServer.demo.model.Seat;
import com.busSeatBookinServer.demo.service.SeatService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/api/seats")
@RestController
@CrossOrigin(origins = "*")
public class SeatController {
    
    @Autowired
    private SeatService seatService;
    
    @GetMapping("/{scheduleId}")
    public List<Seat> getSeatsByScheduleId(@PathVariable Long scheduleId) {
        return seatService.getSeatsByScheduleId(scheduleId);
    }
    
}
