package com.busSeatBookinServer.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.busSeatBookinServer.demo.model.Schedule;
import com.busSeatBookinServer.demo.repository.ScheduleRepository;

public class ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<Schedule> getSchedulesBetween(String source , String destination , String departure , String arrival){
        LocalDateTime departureTime = LocalDateTime.parse(departure);
        LocalDateTime arrivalTime = LocalDateTime.parse(arrival);

        return scheduleRepository.getBusSchedulesBetween(source , destination , departureTime , arrivalTime);
    }
}
