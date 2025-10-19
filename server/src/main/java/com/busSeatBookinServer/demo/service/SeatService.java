package com.busSeatBookinServer.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.busSeatBookinServer.demo.model.Seat;
import com.busSeatBookinServer.demo.repository.SeatsRepository;

public class SeatService {
    @Autowired
    private SeatsRepository seatsRepository;

    public List<Seat> getSeatsByScheduleId(Long scheduleId){
        return seatsRepository.findSeatsBySchedule(scheduleId);
    }
    
}
